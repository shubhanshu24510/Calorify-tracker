<h1 align="center">🔥 Caloriefy – Your Smart Calorie & Nutrition Tracker</h1>

<p align="center">
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
  <a href="https://android-arsenal.com/api?level=21"><img alt="API" src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat"/></a>
</p>

<p align="center">  
Caloriefy is a smart calorie tracker app designed to help users maintain a healthy lifestyle by tracking their daily nutritional intake and personal fitness goals.
</p>

<!-- Simulate light green background using an image row with alt text -->
<p align="center">
  <img src="https://github.com/user-attachments/assets/7d258bca-2ed7-49ac-bbe0-555448248a84" alt="screen-2" width="260"/>
  <img src="https://github.com/user-attachments/assets/011feaf1-5f30-4fec-865e-987b576c79af" alt="screen-3" width="260"/>
  <img src="https://github.com/user-attachments/assets/6fe60c5d-51e0-40a1-8eca-d9669e1d5aec" alt="screen-1" width="260"/>
</p>

## Tech stack & Open-source libraries
- Minimum SDK level 21.
- [Kotlin](https://kotlinlang.org/) based, utilizing [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) + [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/) for asynchronous operations.
- 
- Jetpack Libraries:
  - Jetpack Compose: Android’s modern toolkit for declarative UI development.
  - Lifecycle: Observes Android lifecycles and manages UI states upon lifecycle changes.
  - ViewModel: Manages UI-related data and is lifecycle-aware, ensuring data survival through configuration changes.
  - Navigation: Facilitates screen navigation, complemented by [Hilt Navigation Compose](https://developer.android.com/jetpack/compose/libraries#hilt) for dependency injection.
  - Room: Constructs a database with an SQLite abstraction layer for seamless database access.
  - [Hilt](https://dagger.dev/hilt/): Facilitates dependency injection.
- Architecture:
  - MVVM Architecture (View - ViewModel - Model): Facilitates separation of concerns and promotes maintainability.
  - Repository Pattern: Acts as a mediator between different data sources and the application's business logic.
- [Retrofit2 & OkHttp3](https://github.com/square/retrofit): Constructs REST APIs and facilitates paging network data retrieval.
- [Sandwich](https://github.com/skydoves/Sandwich): Adaptable and lightweight sealed API library designed for handling API responses and exceptions in Kotlin for Retrofit, Ktor, and Kotlin Multiplatform.
- [Kotlin Serialization](https://github.com/Kotlin/kotlinx.serialization): Kotlin multiplatform / multi-format reflectionless serialization.
- [ksp](https://github.com/google/ksp): Kotlin Symbol Processing API for code generation and analysis.
- [Turbine](https://github.com/cashapp/turbine): A small testing library for kotlinx.coroutines Flow.
- [Landscapist Glide](https://github.com/skydoves/landscapist#glide), [animation](https://github.com/skydoves/landscapist#animation), [placeholder](https://github.com/skydoves/landscapist#placeholder): A pluggable, highly optimized Jetpack Compose and Kotlin Multiplatform image loading library that fetches and displays network images with Glide, Coil, and Fresco.
- [Baseline Profiles](https://medium.com/proandroiddev/improve-your-android-app-performance-with-baseline-profiles-297f388082e6): Enhances app performance by including specifications of classes and methods in the APK that can be utilized by Android Runtime.


## Architecture
**Calorify Jetpack** adheres to the MVVM architecture and implements the Repository pattern, aligning with [Google's official architecture guidance](https://developer.android.com/topic/architecture).

![architecture](https://github.com/user-attachments/assets/09ca369a-968a-435e-bb89-f1856120bac5)

The architecture of **Pokedex Jetpack** is structured into two distinct layers: the UI layer and the data layer. Each layer fulfills specific roles and responsibilities, outlined as follows:

**Calorify** follows the principles outlined in the [Guide to app architecture](https://developer.android.com/topic/architecture), making it an exemplary demonstration of architectural concepts in practical application.

### Architecture Overview

![architecture](https://github.com/user-attachments/assets/29f555f6-2339-40dc-899c-79835b0c7fb7)

- Each layer adheres to the principles of [unidirectional event/data flow](https://developer.android.com/topic/architecture/ui-layer#udf): the UI layer sends user events to the data layer, and the data layer provides data streams to other layers.
- The data layer operates autonomously from other layers, maintaining purity without dependencies on external layers.

This loosely coupled architecture enhances component reusability and app scalability, facilitating seamless development and maintenance.

### UI Layer

![architecture](https://github.com/user-attachments/assets/80d123e6-e72b-4ca8-998b-a9edec78ae19)

The UI layer encompasses UI elements responsible for configuring screens for user interaction, alongside the [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel), which manages app states and restores data during configuration changes.
- UI elements observe the data flow, ensuring synchronization with the underlying data layer.

### Data Layer

![architecture](https://github.com/user-attachments/assets/0bdebc42-69a1-41a2-ad8f-d57d3cbf9124)

The data layer is composed of repositories that handle business logic tasks such as retrieving data from a local database or fetching remote data from a network. This layer is designed to prioritize offline access, functioning primarily as an offline-first repository of business logic. It adheres to the principle of "single source of truth," ensuring that all data operations are centralized and consistent.<br>

**Calorify** is an offline-first app, meaning it can perform all or most of its essential functions without an internet connection. This design allows users to access core features reliably, regardless of network availability, reducing their need for constant updates and decreasing data usage. For more details on how to build an offline-first application, you can visit [Build an offline-first app](https://developer.android.com/topic/architecture/data-layer/offline-first).

## Modularization

**Calorify** adopted modularization strategies below:

- **Reusability**: Modulizing reusable codes properly enable opportunities for code sharing and limits code accessibility in other modules at the same time.
- **Parallel Building**: Each module can be run in parallel and it reduces the build time.
- **Strict visibility control**: Modules restrict to expose dedicated components and access to other layers, so it prevents they're being used outside the module
- **Decentralized focusing**: Each developer team can assign their dedicated module and they can focus on their own modules.

For more information, check out the [Guide to Android app modularization](https://developer.android.com/topic/modularization).
