import typer

from sync_packages import app as sync_packages
from version import app as version

app = typer.Typer(
    no_args_is_help=True,
)

app.add_typer(version)
app.add_typer(sync_packages)


if __name__ == "__main__":
    app()
