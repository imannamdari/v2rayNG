package com.v2ray.ang.dto

data class VmessQRCode(
    var v: String = "",
    var ps: String = "",
    var add: String = "",
    var port: String = "",
    var id: String = "",
    var aid: String = "0",
    var scy: String = "",
    var net: String = "",
    var type: String = "",
    var host: String = "",
    var path: String = "",
    var tls: String = "",
    var sni: String = "",
    var serverIP: String = "",
    var echConfigList: String = "",
    var sshEnable: String = "",
    var sshIP: String = "",
    var sshUser: String = "",
    var sshPassword: String = "",
    var sshRunningPort: String = "0",
    var alpn: String = "",
    var fp: String = ""
)