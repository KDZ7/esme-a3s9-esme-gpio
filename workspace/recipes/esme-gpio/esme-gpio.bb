LICENSE = "CLOSED"

inherit pkgconfig
inherit update-rc.d

PACKAGES ??= "${PN}"
INITSCRIPT_NAME = "esme-led"
DEPENDS = "libgpiod (< 2.0)"

do_install () {
        # This is a guess; additional arguments may be required
        oe_runmake install INSTALL_DIR=${D}
}