# 🎮 MC-Launcher Mobile

تطبيق ماينكرافت محترف للأجهزة الذكية - مشغّل ماينكرافت مع واجهة رسومية حديثة باستخدام Jetpack Compose

## ✨ المميزات الرئيسية

- 🎮 **تشغيل متعدد الإصدارات** - اختر من بين عدة إصدارات من Minecraft
- 👤 **إدارة الحسابات** - احفظ وأدر حسابات متعددة بسهولة
- 🧩 **إدارة المودات** - ثبّت وفعّل/عطّل المودات بكل سهولة
- ⚙️ **إعدادات متقدمة** - تحكم كامل بإعدادات الجهاز والذاكرة
- 📱 **واجهة حديثة** - تصميم جميل مع Jetpack Compose
- 🌙 **وضع ليلي** - تصميم داكن لحماية العين

## 🛠️ المتطلبات

- Android 8.0 (API 26) أو أحدث
- Android Studio Flamingo أو أحدث
- Java 8 أو أحدث
- Gradle 8.0+

## 🚀 البدء السريع

### 1. نسخ المشروع
```bash
git clone https://github.com/salemxml/mc-launcher-mobile-.git
cd mc-launcher-mobile
```

### 2. فتح المشروع في Android Studio
```bash
- افتح Android Studio
- اضغط File > Open
- اختر مجلد المشروع
```

### 3. بناء وتشغيل
```bash
# في Terminal أو في Android Studio
./gradlew build
./gradlew installDebug
```

## 📁 هيكل المشروع

```
mc-launcher-mobile/
├── app/
│   ├── src/main/
│   │   ├── java/com/salemxml/mclauncher/
│   │   │   ├── MainActivity.kt
│   │   │   ├── ui/
│   │   │   │   ├── screens/
│   │   │   │   │   ├── HomeScreen.kt
│   │   │   │   │   ├── AccountsScreen.kt
│   │   │   │   │   ├── ModsScreen.kt
│   │   │   │   │   └── SettingsScreen.kt
│   │   │   │   └── theme/
│   │   │   │       ├── Color.kt
│   │   │   │       ├── Theme.kt
│   │   │   │       └── Type.kt
│   │   │   └── managers/
│   │   │       ├── GameManager.kt
│   │   │       ├── AccountManager.kt
│   │   │       └── ModManager.kt
│   │   ├── AndroidManifest.xml
│   │   └── res/
│   └── build.gradle.kts
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 📱 الشاشات الرئيسية

### 🏠 الشاشة الرئيسية (Home)
- عرض الحساب المختار
- اختيار الإصدار
- إعدادات سريعة (RAM)
- زر التشغيل

### 👤 شاشة الحسابات (Accounts)
- قائمة الحسابات المحفوظة
- إضافة حساب جديد
- تحديث بيانات الحساب
- حذف الحساب

### 🧩 شاشة المودات (Mods)
- قائمة المودات المثبتة
- إضافة Mod جديد
- تفعيل/تعطيل المودات
- حذف Mod

### ⚙️ شاشة الإعدادات (Settings)
- إدارة ذاكرة الجهاز (RAM)
- تفعيل/تعطيل المودات عام
- معلومات التطبيق
- سياسة الخصوصية

## 🎨 التخصيص

### تغيير الألوان
عدّل ملف `ui/theme/Color.kt`:
```kotlin
val PrimaryGreen = Color(0xFF00FF00)
val DarkBackground = Color(0xFF1E1E1E)
```

### تغيير الخطوط
عدّل ملف `ui/theme/Type.kt`

### إضافة شاشات جديدة
1. أنشئ ملف Kotlin جديد في `ui/screens/`
2. أضف `@Composable` function
3. أضفها في Navigation في `MainActivity.kt`

## 📦 التبعيات الرئيسية

- **Jetpack Compose** - واجهة رسومية حديثة
- **Navigation Compose** - للتنقل بين الشاشات
- **Gson** - معالجة JSON
- **Retrofit** - HTTP requests
- **OkHttp** - HTTP client
- **Kotlin Coroutines** - العمليات غير المتزامنة

## 🔐 الأمان

- ✅ جميع البيانات مشفرة محليًا
- ✅ لا يتم إرسال أي بيانات شخصية
- ✅ صلاحيات محدودة للوصول إلى الملفات

## 📝 الترخيص

هذا المشروع مرخص تحت رخصة MIT - انظر [LICENSE](LICENSE)

## 🤝 المساهمة

نرحب بمساهماتكم! يرجى:

1. Fork المشروع
2. إنشاء فرع للميزة (`git checkout -b feature/AmazingFeature`)
3. Commit التغييرات (`git commit -m 'Add AmazingFeature'`)
4. Push للفرع (`git push origin feature/AmazingFeature`)
5. فتح Pull Request

## 💬 الدعم والتواصل

- 🐛 الإبلاغ عن الأخطاء: استخدم GitHub Issues
- 💡 الاقتراحات: فتح Discussion جديد
- 📧 البريد الإلكتروني: [بريدك]

## 👨‍💻 المطور

**Salem XML** - [@salemxml](https://github.com/salemxml)

## 🙏 شكر خاص

شكرًا لمجتمع Kotlin و Jetpack Compose والمطورين الذين يدعمون هذا المشروع!

---

**ملاحظة:** هذا المشروع مستقل وغير مرتبط رسميًا بـ Minecraft أو Mojang Studios.

**الإصدار:** 1.0.0 ✨

<!-- build trigger -->
