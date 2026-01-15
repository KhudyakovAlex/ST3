# ST3

Initial repository setup.

## Assets

- `IMG/` — source images from Pixso/design.
- **Не скачиваем файлы картинок из Pixso**. Берём Pixso NodeDSL и сопоставляем ассеты с уже существующими файлами в `IMG/`.
- **Растровые изображения (PNG/JPG/WEBP)**: ключ поиска — `fillPaints[].image.name` из NodeDSL (без учёта регистра; нормализуем пробелы/`_`/`-`; подбираем расширение).
- **Векторные логотипы (SVG)**: ключ поиска — `node.name` (например `"name":"Logo_Synaps"` → `IMG/Logo_Synaps.svg`, с той же нормализацией).
- Build sync: `IMG/**` → `app/src/main/assets/design/**` (runs on `preBuild`).
