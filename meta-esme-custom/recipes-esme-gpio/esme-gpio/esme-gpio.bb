LICENSE = "CLOSED"

# No information for SRC_URI yet (only an external source tree was specified)
SRC_URI = "git://github.com/KDZ7/esme-a3s9.git;protocol=https;branch=main "
PV = "1.0+git"
SRCREV = "56567ca32d964123c7dac81dfd117c882a33a47d"
S = "${WORKDIR}/git"

inherit pkgconfig
inherit update-rc.d

PACKAGES ??= "${PN}"
INITSCRIPT_NAME = "esme-led"

DEPENDS = "libgpiod (< 2.0)"

do_install () {
        # This is a guess; additional arguments may be required
        oe_runmake install INSTALL_DIR=${D}
}
