require linaro-image-common.inc

IMAGE_INSTALL += " \
    arndale-pre-boot \
    bridge-utils \
    calibrator \
    curl \
    fping \
    lmbench \
    ltp \
    netperf \
    openvswitch \
    procps \
    python-numpy \
    qemu \
    rt-tests \
    trinity-example \
    tunctl \
    "

IMAGE_INSTALL_append_armv7a = " \
    latency-test \
    systemtap \
    valgrind \
    "

IMAGE_FEATURES += "\
    dev-pkgs \
    staticdev-pkgs \
    tools-debug \
    tools-sdk \
    "