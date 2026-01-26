Правило для LLM:
- Растровые изображения брать из IMG.
- Векторные изображения (SVG/иконки/логотипы) вытягивать по MCP из Pixso.

## Токены Pixso

### Синхронизация
Команда: **"обнови токены из Pixso"**

### Файлы токенов
- `ui/theme/PixsoColors.kt` — цвета (116 шт)
- `ui/theme/PixsoDimens.kt` — размеры (123 шт)
- `ui/theme/PixsoStrings.kt` — строки/шрифты (42 шт)
- `ui/theme/PixsoTypography.kt` — TextStyle на основе токенов
- `tokens/pixso_tokens_map.json` — маппинг Pixso ID → Kotlin name

### Привязка токенов
Связь по **Pixso ID** (не по имени):
```json
{
  "2:14": {
    "pixsoName": "Color/Primary/Primary_40",
    "kotlinName": "Color_Primary_Primary_40",
    "type": "color"
  }
}
```

### При синхронизации
1. Получить токены: MCP `getVariableSets`
2. Сравнить ID с `pixso_tokens_map.json`
3. Обнаружить: добавленные / удалённые / переименованные
4. Обновить Kotlin файлы
5. Обновить маппинг
