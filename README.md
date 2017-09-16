# Oluetta
WebView app for showing a web page in a cheap "kiosk-mode" using screen pinning

Most of the inspiration comes from here: http://www.sureshjoshi.com/mobile/android-kiosk-mode-without-root/

## Usage 1

1. Edit url && build
1. Enable screen pinning in security settings
1. Start app
1. Pin from overview/recent apps list

## Usage 2

1. Build and install
1. Set as device owner (adb shell dpm set-device-owner fi.badgamers.oluetta/.AdminReceiver)
1. Start app
1. Double tap anywhere to enter settings

## TODO

* protect the settings with a passcode of some kind
