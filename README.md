# ST3

Initial repository setup.

## Assets

- `ASSETS/` — source images from Pixso/design.
- **Do not download image files from Pixso**. Use Pixso NodeDSL and map image layers to existing files in `ASSETS/`.
- **Lookup key**: prefer `fillPaints[].image.name` from NodeDSL (case-insensitive; normalize spaces/`_`/`-`; then try extensions like `.png/.jpg/.webp/.svg`).
- Build sync: `ASSETS/**` → `app/src/main/assets/design/**` (runs on `preBuild`).
