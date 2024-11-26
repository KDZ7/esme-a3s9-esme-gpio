SUMMARY = "Packagegroup for ESME utilities"
DESCRIPTION = "This packagegroup includes utilities such as esme-led."
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} += "esme-led"
