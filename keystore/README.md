# Keystore Setup

This folder is for the release keystore file. It is excluded from Git.

## Generate a new Keystore

Run this command once on your machine:

```bash
keytool -genkey -v \
  -keystore release.jks \
  -alias mclauncher \
  -keyalg RSA \
  -keysize 2048 \
  -validity 10000
```

## Add Secrets to GitHub

Go to your repo → **Settings** → **Secrets and variables** → **Actions** → **New repository secret**

Add these 4 secrets:

| Secret Name        | Value                                      |
|--------------------|--------------------------------------------|
| `KEYSTORE_BASE64`  | Output of: `base64 -w 0 release.jks`      |
| `KEYSTORE_PASSWORD`| The password you set for the keystore      |
| `KEY_ALIAS`        | The alias you used (e.g. `mclauncher`)     |
| `KEY_PASSWORD`     | The key password (same or different)       |

## Local Build with Signing

Set environment variables then run:

```bash
export KEYSTORE_PATH=keystore/release.jks
export KEYSTORE_PASSWORD=your_password
export KEY_ALIAS=mclauncher
export KEY_PASSWORD=your_key_password

./gradlew assembleRelease
```
