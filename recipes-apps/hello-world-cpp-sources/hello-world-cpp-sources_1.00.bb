SUMMARY = "Hello World Cpp App Example"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
file://COPYING;md5=1522c70c5c12cf2c1322df6ed2ad55d3 \
"

SRC_URI = "\
file://COPYING \
file://main.cpp \
"

S = "${WORKDIR}"

do_compile() {
    ${CXX} ${CXXFLAGS} main.cpp -o hello-world-cpp-sources ${LDFLAGS}
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hello-world-cpp-sources ${D}${bindir}
}

