# 🏃 Running Track App

A modern Android fitness tracking application built with
Clean Architecture and latest Android development best practices.

## 📱 Features
- Track running sessions (distance, duration, calories)
- View run history with statistics
- Offline-first support
- Real-time data sync

## 🏗️ Architecture
Clean Architecture with Multi-Module setup:
:app
:core:domain → Use Cases, Domain Models, Repository interfaces
:core:data → Repository implementations, Room, Retrofit
:core:presentation → ViewModels, UI State
:feature:run → Run tracking feature
:feature:statistics → Statistics screen

## 🛠️ Tech Stack

| Category | Technology                   |
|---|------------------------------|
| Language | Kotlin                       |
| UI | Jetpack Compose              |
| Architecture | Clean Architecture + MVVM    |
| Async | Coroutines + Flow            |
| Database | Room                         |
| Networking | Ktor                         |
| DI | koin                         |
| Build | Multi-module Gradle          |
| CI/CD | GitHub Actions (coming soon) |

## 📐 Module Structure
app/
core/
├── domain/ # Pure Kotlin, no Android dependencies
├── data/ # Repository impl, Room, Retrofit
└── presentation/ # Base ViewModel, UI components
feature/
├── run/ # Run tracking feature
└── statistics/ # Statistics & history

## 🚀 Getting Started

### Prerequisites
- Android Studio Hedgehog or later
- JDK 17
- Android SDK 26+

### Installation
```bash
git clone https://github.com/sathishkumar1392/RunTracker
cd RunningTrackApp
```
Open in Android Studio and run on emulator or device.

## 📊 Status
🚧 Currently in active development

| Module | Status |
|---|---|
| Project Setup | ✅ Complete |
| Multi-module Gradle | ✅ Complete |
| Room Database | 🚧 In Progress |
| Repository Layer | 📋 Planned |
| ViewModel Layer | 📋 Planned |
| Compose UI | 📋 Planned |
| Statistics | 📋 Planned |
| CI/CD Pipeline | 📋 Planned |

## 👨‍💻 Developer
**Sathish Kumar** — Senior Android Developer
- 8+ years Kotlin + Jetpack Compose
- Clean Architecture specialist
- Based in Berlin, Germany

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue)](https://www.linkedin.com/in/sathish-kumar-234075a1)
[![GitHub](https://img.shields.io/badge/GitHub-Follow-black)](https://github.com/sathishkumar1392)