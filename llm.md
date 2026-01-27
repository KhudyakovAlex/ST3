Правило для LLM:
- Растровые изображения брать из IMG.
- Векторные изображения (SVG/иконки/логотипы) вытягивать по MCP из Pixso.

## Токены Pixso

### Синхронизация
Команда: **"обнови токены из Pixso"**

### Файлы токенов
- `ui/theme/PixsoColors.kt` — цвета (83 base + 33 aliases)
- `ui/theme/PixsoDimens.kt` — размеры (66 base + 57 aliases)
- `ui/theme/PixsoStrings.kt` — строки/шрифты (4 base + 38 aliases)
- `ui/theme/PixsoTypography.kt` — TextStyle на основе токенов
- `tokens/pixso_tokens_map.json` — маппинг Pixso ID → Kotlin name

### Иерархия токенов
Токены разделены на **базовые** и **алиасы**:
```kotlin
// ===== BASE VALUES =====
val Font_Size_Size_16 = 16.sp

// ===== ALIASES =====
val Body_Body_L_Size = Font_Size_Size_16  // ссылка на базовый
val Button_Button_M_Size = Font_Size_Size_16
```
При изменении базового токена — все алиасы обновятся автоматически.

### Привязка токенов
Связь по **Pixso ID** (не по имени):
```json
{
  "2:14": {
    "pixsoName": "Color/Primary/Primary_40",
    "kotlinName": "Color_Primary_Primary_40",
    "type": "color",
    "isAlias": false,
    "value": "0xFFRRGGBB"
  },
  "8:120": {
    "pixsoName": "Body/Body L/Tracking",
    "kotlinName": "Body_Body_L_Tracking",
    "type": "number",
    "isAlias": true,
    "refId": "8:50",
    "refName": "Font/Tracking/Tracking_1"
  }
}
```

### Отслеживание изменений
При синхронизации сравниваем:
- **Структура**: добавленные / удалённые / переименованные токены
- **Ссылки**: `refId` у алиасов — смена целевого токена
- **Значения**: `value` у базовых — изменение цвета/числа/строки

### При синхронизации
1. Получить токены: MCP `getVariableSets`
2. Сравнить с `pixso_tokens_map.json`:
   - ID токенов (добавленные/удалённые)
   - Имена (переименования)
   - `refId` у алиасов (смена ссылки)
   - `value` у базовых (изменение значения)
3. Обновить Kotlin файлы
4. Обновить маппинг
