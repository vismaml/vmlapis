import setuptools
import os

tag = os.environ.get('TAG_NAME', 'v0.0.0')
assert tag
version = tag.strip('v')

setuptools.setup(
    name="ssn_proto",
    version=version,
    description="A package containing ssn protobuf definitions for python",
    url="https://github.com/economic/vmlapis",
    packages=setuptools.find_packages(where='gen/python/'),
    package_dir={'ssn': 'gen/python/ssn',
                 'gen_bq_schema': 'gen/python/gen_bq_schema'},
    classifiers=[
        "Programming Language :: Python :: 3",
    ],
    include_package_data=True,
    zip_safe=False,
)
