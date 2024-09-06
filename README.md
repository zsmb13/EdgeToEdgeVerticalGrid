# Edge-to-edge LazyVerticalGrid

Steps to reproduce the issue:

1. Run app in portrait mode, on a device with a display cutout
2. Rotate device to landscape: the right edge of the grid appears cut off
3. Rotate device back to portrait: the grid has excess padding on its right

Removing `android:configChanges="orientation"` from the manifest fixes the issue, as the Activity is then recreated on rotation.

<video src="https://github.com/zsmb13/EdgeToEdgeVerticalGrid/raw/main/recording.mp4" controls="controls" style="max-width: 730px;"></video>
