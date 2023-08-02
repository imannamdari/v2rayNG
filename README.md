# V2RAYNG with ECH support
This is an experimental project that adds ECH support to [v2rayng project](https://github.com/2dust/v2rayNG).

If your domain is behind a CDN and has been censored, you can use this project to bypass it.
Currently this project only supports Cloudflare CDN.

There are two steps that your domain send in plain text: In DNS query and TLS handshake.
For concealing the domain in DNS query, you can use DNS over HTTPS or hardcode the ip of your domain in the app settings. (which will be covered in [How to Use](#how-to-use) part)
For concealing the domain in TLS handshake, you should use ECH.
ECH is an approach that can hide SNI or other critical info in TLS handshake. You can learn more about ECH [here](https://blog.cloudflare.com/handshake-encryption-endgame-an-ech-update).

This project is also compatible with standard v2rayNG configs. So you are able to use your previous v2rayNG configs in this app.

# How to Build
This project use custom [AndroidXrayLite](https://github.com/imannamdari/AndroidLibXrayLite).
This custom lib is based on custom [Xray core](https://github.com/imannamdari/Xray-core) which supports ECH.
It also depends on other custom libs which you can find in the repo.

So for building you should build project alongside this custom [AndroidXrayLite](https://github.com/imannamdari/AndroidLibXrayLite) and the rest is as usual.

# How to Use
Build the project or download the binary. Fill mutual configs that you use in standard v2rayNG app.
Then, at the end of the configs you can see ech configs.

Set `enable_ech` config to `true`.

By default this project use `127.0.0.1:53` for dns lookup. (in the case you want to use DNS over HTTPS) This lookup is only used for getting ECH keys and will not be used for other dns lookups.
you can change that by setting `echo_dns` to your preferred dns addr. (like cloudflare 1.1.1.1:53 or google 8.8.8.8:53).

Fill `server_ip` part to your preferred cloudflare IP. It can be any cloudflare IP.
For finding the best cloudflare IP address based on your ISP, visit this [website](https://ircf.space/).

A sample of these configs is like bellow:

```json
{
  "enable_ech": true,
  "ech_dns": "1.1.1.1:53",
  "server_ip": "104.21.68.146"
}
```
