# Product Type Enum Design

**Date:** 2026-03-18
**Branch:** products-api
**File:** `proto/asgt/v2/product_service.proto`

## Problem

`ProductTypeCandidate.label` is a free-form string (e.g. `"Telephony and related accessories"`). Clients who need to drive logic based on product type are forced to do fragile string matching. The 75 product type categories are a fixed, closed set from a trained XLM-RoBERTa model — making an enum the natural fit.

## Decision

**Option B: Enum + label string.** Add a `ProductType` enum field alongside the existing `label` string. Clients use `type` for logic and `label` for display. Both fields are always populated by the server.

Alternatives considered:
- **Enum only (no label):** Clients must maintain their own display strings, risking drift from actual model output. Rejected.
- **Enum + separate `ListProductTypes` RPC:** Extra complexity for a near-static list. Rejected.

## Design

### `ProductType` Enum

Top-level enum in `product_service.proto`. Proto3 requires the default value to be 0, so `PRODUCT_TYPE_UNKNOWN = 0`. The 74 known categories are numbered 1–74, ordered by model ID for traceability. The model's `Unknown` label (model id 70) maps to `PRODUCT_TYPE_UNKNOWN = 0` and continues to be filtered out before returning to callers.

```protobuf
enum ProductType {
  PRODUCT_TYPE_UNKNOWN = 0;
  PRODUCT_TYPE_ACCOUNTING_AND_AUDIT_SERVICES = 1;
  PRODUCT_TYPE_ACCOUNTING_SOFTWARE = 2;
  PRODUCT_TYPE_ADVERTISING = 3;
  PRODUCT_TYPE_ALCOHOLIC_BEVERAGES_TOBACCO = 4;
  PRODUCT_TYPE_ALL_MEDICAL_AND_LABORATORY_EQUIPMENT = 5;
  PRODUCT_TYPE_BANKING_AND_INVESTMENT_SERVICES = 6;
  PRODUCT_TYPE_BOOKS_AND_PUBLICATIONS = 7;
  PRODUCT_TYPE_BUSINESS_AND_MANAGEMENT_CONSULTATION_SERVICES = 8;
  PRODUCT_TYPE_CHEMICALS_AND_CHEMICAL_PRODUCTS = 9;
  PRODUCT_TYPE_CLEANING_AND_JANITORIAL_SERVICES = 10;
  PRODUCT_TYPE_CLEANING_EQUIPMENT_AND_SUPPLIES = 11;
  PRODUCT_TYPE_CLOTHING_AND_ACCESSORIES = 12;
  PRODUCT_TYPE_COMPUTER_AND_CONSUMER_ELECTRONICS = 13;
  PRODUCT_TYPE_CONSTRUCTION_AND_BUILDING_MATERIALS = 14;
  PRODUCT_TYPE_DECORATIONS_AND_ART_SUPPLIES = 15;
  PRODUCT_TYPE_DEFENSE_SECURITY_SAFETY_EQUIPMENT_AND_SERVICES = 16;
  PRODUCT_TYPE_DEPOSITS = 17;
  PRODUCT_TYPE_DOMESTIC_APPLIANCES_AND_ELECTRONIC_PRODUCTS = 18;
  PRODUCT_TYPE_EDUCATION_AND_TRAINING_SERVICES = 19;
  PRODUCT_TYPE_ENERGY_UTILITIES = 20;
  PRODUCT_TYPE_FACILITY_CONSTRUCTION_AND_MAINTENANCE_SERVICES = 21;
  PRODUCT_TYPE_FARMING_FISHING_FORESTRY_AND_WILDLIFE_CONTRACTING_SERVICES = 22;
  PRODUCT_TYPE_FEES = 23;
  PRODUCT_TYPE_FINES_AND_PENALTIES = 24;
  PRODUCT_TYPE_FOOD_AND_NON_ALCOHOLIC_BEVERAGES = 25;
  PRODUCT_TYPE_FUEL_LUBRICANTS_AND_ANTI_CORROSIVES = 26;
  PRODUCT_TYPE_FURNITURE = 27;
  PRODUCT_TYPE_GIFTS_AND_AWARDS = 28;
  PRODUCT_TYPE_GLASS_PORCELAIN_AND_CERAMIC_PRODUCTS = 29;
  PRODUCT_TYPE_GOVERNMENT_AND_PUBLIC_SECTOR_ADMINISTRATIVE_SERVICES = 30;
  PRODUCT_TYPE_GRAPHIC_DESIGN_AND_CREATIVE_SERVICES = 31;
  PRODUCT_TYPE_HEALTH_OR_FITNESS_CLUBS = 32;
  PRODUCT_TYPE_HEALTHCARE_SERVICES = 33;
  PRODUCT_TYPE_HOTELS_AND_LODGING = 34;
  PRODUCT_TYPE_INDUSTRIAL_MACHINERY_EQUIPMENT_AND_TOOLS = 35;
  PRODUCT_TYPE_INDUSTRIAL_PRODUCTION_AND_MANUFACTURING_SERVICES = 36;
  PRODUCT_TYPE_INSURANCE = 37;
  PRODUCT_TYPE_INTERNET_INFORMATION_AND_MEDIA_TECHNOLOGY = 38;
  PRODUCT_TYPE_LEASE_AND_RENTAL_OF_PROPERTY_OR_BUILDING = 39;
  PRODUCT_TYPE_LEGAL_SERVICES = 40;
  PRODUCT_TYPE_LIVE_PLANTS_ANIMALS_AND_RELATED_SUPPLIES = 41;
  PRODUCT_TYPE_MACHINERY_AND_EQUIPMENT_LEASING = 42;
  PRODUCT_TYPE_MARKETING = 43;
  PRODUCT_TYPE_MEETING_EVENTS = 44;
  PRODUCT_TYPE_MUSIC_MUSICAL_INSTRUMENTS_AND_RELATED_EQUIPMENT = 45;
  PRODUCT_TYPE_OFFICE_SUPPLIES = 46;
  PRODUCT_TYPE_PACKAGING = 47;
  PRODUCT_TYPE_PARKING_FEES = 48;
  PRODUCT_TYPE_PASSENGER_TRANSPORT = 49;
  PRODUCT_TYPE_PAYMENT_SOLUTIONS = 50;
  PRODUCT_TYPE_PAYROLL_ACCOUNTING_SERVICES = 51;
  PRODUCT_TYPE_PERSONAL_AND_DOMESTIC_SERVICES = 52;
  PRODUCT_TYPE_PERSONAL_CARE_PRODUCTS = 53;
  PRODUCT_TYPE_PHARMACEUTICALS = 54;
  PRODUCT_TYPE_PHOTO_AUDIO_AND_VIDEO_EQUIPMENT_AND_SUPPLIES = 55;
  PRODUCT_TYPE_RECREATIONAL_AND_RELIGIOUS_SERVICES = 56;
  PRODUCT_TYPE_RESEARCH_AND_TECHNOLOGICAL_CONSULTATION_SERVICES = 57;
  PRODUCT_TYPE_RESTAURANTS = 58;
  PRODUCT_TYPE_RETIREMENT_FUNDS = 59;
  PRODUCT_TYPE_SHIPPING_TRANSPORT_AND_LOGISTICS = 60;
  PRODUCT_TYPE_SOFTWARE_DIGITAL_LICENSES_AND_SERVICES = 61;
  PRODUCT_TYPE_SPORTS_AND_RECREATIONAL_EQUIPMENT = 62;
  PRODUCT_TYPE_STORAGE = 63;
  PRODUCT_TYPE_TAXATION = 64;
  PRODUCT_TYPE_TELEPHONY_AND_RELATED_ACCESSORIES = 65;
  PRODUCT_TYPE_TEXTILES_AND_TEXTILE_ARTICLES = 66;
  PRODUCT_TYPE_TIMEPIECES_AND_JEWELRY = 67;
  PRODUCT_TYPE_TOLLS = 68;
  PRODUCT_TYPE_TOYS_AND_GAMES = 69;
  PRODUCT_TYPE_TRADE_AND_REPAIR_SERVICES = 70;
  PRODUCT_TYPE_VEHICLE_RENTALS = 71;
  PRODUCT_TYPE_VEHICLES_AND_RELATED_ACCESSORIES_AND_COMPONENTS = 72;
  PRODUCT_TYPE_WATER_SEWER_AND_WASTE_UTILITIES = 73;
  PRODUCT_TYPE_WEBSITE_AND_DOMAIN_SERVICE = 74;
}
```

### Updated `ProductTypeCandidate` Message

```protobuf
message ProductTypeCandidate {
  ProductType type = 1;              // enum — use for client logic
  string label = 2;                  // human-readable — use for display
  float confidence = 3;
  ConfidenceLevel confidence_level = 4;
}
```

Field numbers are renumbered freely (API is pre-production, no wire compatibility constraint).

## Stability Contract

The category set is considered **occasionally stable** — changes happen only with new model versions and always correspond to an API version bump. When categories are added, new enum values are appended. When categories are removed, their enum values are reserved (never reused). Renames require a new enum value.

## Mapping: Model ID → Enum Value

The model's `id2label` runs 0–74 with `Unknown` at id 70. Enum values 1–74 follow the same ordering as model IDs 0–69 and 71–74, with `PRODUCT_TYPE_UNKNOWN = 0` absorbing the model's id 70.

| Model ID | Label | Enum value |
|----------|-------|------------|
| 70 | Unknown | 0 (PRODUCT_TYPE_UNKNOWN) |
| 0–69 | (categories) | 1–70 |
| 71–74 | (categories) | 71–74 |
