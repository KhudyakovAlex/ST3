# ST3

Initial repository setup.

## Assets

- `IMG/` — source images from Pixso/design.
- **Do not download image files from Pixso**. Use Pixso NodeDSL and map image layers to existing files in `IMG/`.
- **Lookup key**: prefer `fillPaints[].image.name` from NodeDSL (case-insensitive; normalize spaces/`_`/`-`; then try extensions like `.png/.jpg/.webp/.svg`).
- Build sync: `IMG/**` → `app/src/main/assets/design/**` (runs on `preBuild`).
