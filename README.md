# ST3

Initial repository setup.

## Assets

- `IMG/` — source images from Pixso/design.
- **Не скачиваем файлы картинок из Pixso**. Берём Pixso NodeDSL и сопоставляем ассеты с уже существующими файлами в `IMG/`.
- **Растровые изображения (PNG/JPG/WEBP)**: ключ поиска — `fillPaints[].image.name` из NodeDSL (без учёта регистра; нормализуем пробелы/`_`/`-`; подбираем расширение).
- **Вектор (SVG)**: в `IMG/` **не храним**. Логотипы/иконки из Pixso переводим в **VectorDrawable** и кладём в `app/src/main/res/drawable/` (пример: `Logo_Synaps` → `drawable/logo_synaps.xml`).
- Build sync: `IMG/**` → `app/src/main/assets/design/**` (runs on `preBuild`).
