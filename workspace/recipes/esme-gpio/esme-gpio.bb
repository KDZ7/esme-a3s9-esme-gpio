# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

# No information for SRC_URI yet (only an external source tree was specified)
SRC_URI = ""

inherit pkgconfig
inherit update-rc.d

PACKAGES ??= "${PN}"
INITSCRIPT_NAME = "esme-led"

# Parameters for starting and stopping the service
INITSCRIPT_PARAMS = "start 99 2 3 4 5 . stop 01 0 1 6 ."

DEPENDS = "libgpiod (< 2.0)"

INSANE_SKIP:${PN} += "ldflags"
# when this question was originally asked the format was
INSANE_SKIP_${PN} += "ldflags"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_configure () {
        # Specify any needed configure commands here
        :
}

do_compile () {
        # You will almost certainly need to add additional arguments here
        oe_runmake
}

do_install () {
        # This is a guess; additional arguments may be required
        oe_runmake install INSTALL_DIR=${D}
}
