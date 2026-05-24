package dev.teamchecky.pantallanoticiasopenwebinars.data.mocks

import dev.teamchecky.pantallanoticiasopenwebinars.model.CategoryModel
import dev.teamchecky.pantallanoticiasopenwebinars.model.NewsModel
import dev.teamchecky.pantallanoticiasopenwebinars.model.NewsSummaryModel
import dev.teamchecky.pantallanoticiasopenwebinars.model.WeatherConditionType
import dev.teamchecky.pantallanoticiasopenwebinars.model.WeatherModel

/**
 * Mock de noticias de última hora.
 * @author Daniel Figueroa
 */
val latestNewsMock = CategoryModel(
    id = 1,
    title = "Últimas noticias",
    items = listOf(
        NewsModel(
            id = 1,
            title = "El nuevo smartphone que solo funciona si bailas salsa",
            description = "Lanzan un móvil que detecta movimientos de baile para desbloquearse. Muchos usuarios ya tienen excusas para ir a clases de baile.",
            imageUrl = "https://www.franciscomlopez.com/openWebinars25/latest_news_1.png",
            date = "1 May 2025",
            author = "Carlos Pérez"
        ),
        NewsModel(
            id = 2,
            title = "Plaga de patos invaden supermercados en busca de pan gratis",
            description = "Vecinos reportan que cientos de patos han tomado tiendas locales, exigiendo ofertas en productos de panadería.",
            imageUrl = "https://www.franciscomlopez.com/openWebinars25/latest_news_2.png",
            date = "2 May 2025",
            author = "Carlos Pérez"
        ),
        NewsModel(
            id = 3,
            title = "Robot aspiradora se declara fan de la música rock y no limpia en conciertos",
            description = "Usuarios notan que sus robots de limpieza se detienen misteriosamente cuando suena música rock.",
            imageUrl = "https://www.franciscomlopez.com/openWebinars25/latest_news_3.png",
            date = "3 May 2025",
            author = "Carlos Pérez"
        ),
        NewsModel(
            id = 4,
            title = "Nuevo deporte olímpico: Carrera de carritos de supermercado",
            description = "Se populariza la carrera en pasillos de supermercados con carritos, mezclando velocidad y esquivar obstáculos.",
            imageUrl = "https://www.franciscomlopez.com/openWebinars25/latest_news_4.png",
            date = "3 May 2025",
            author = "Roberto Rey"
        ),
        NewsModel(
            id = 5,
            title = "Gato alcalde toma decisiones políticas en pueblo pequeño",
            description = "Un gato fue nombrado alcalde simbólicamente y sus decisiones causan más risas que polémicas.",
            imageUrl = "https://www.franciscomlopez.com/openWebinars25/latest_news_5.png",
            date = "4 May 2025",
            author = "Roberto Rey"
        ),
        NewsModel(
            id = 6,
            title = "Tostadora lanza servicio de delivery de pan tostado a domicilio",
            description = "Innovadora tostadora con ruedas lleva el desayuno directo a tu cama, pero solo funciona si cantas bien.",
            imageUrl = "https://www.franciscomlopez.com/openWebinars25/latest_news_6.png",
            date = "4 May 2025",
            author = "Roberto Rey"
        )
    )
)

/**
 * Mock de noticias de deportes.
 * @author Daniel Figueroa
 */
val sportNewsMock = CategoryModel(
    id = 2,
    title = "Deportes",
    items = listOf(
        NewsModel(
            id = 7,
            title = "Equipo de fútbol juega con zapatos deslizantes y gana por accidente",
            description = "Un equipo pierde el control pero gana el partido gracias a las caídas y resbalones del rival.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 8,
            title = "Maratón donde los corredores deben llevar una pizza sin que se caiga",
            description = "Se organiza carrera donde el reto es mantener la pizza intacta hasta la meta.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 9,
            title = "Entrenador de natación usa patos de goma para motivar a su equipo",
            description = "Los nadadores entrenan siguiendo a patos de goma en la piscina, con resultados inesperados.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 10,
            title = "Torneo de ajedrez con piezas gigantes y jugadores disfrazados",
            description = "Competición combina juego de mesa con show teatral y piezas enormes.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 11,
            title = "Jugador de baloncesto entrena lanzando pelotas de tenis",
            description = "Entrena precisión lanzando pelotas pequeñas antes de usar el balón oficial.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 12,
            title = "Equipo de voleibol juega con globos en lugar de pelota",
            description = "Partido divertido donde la pelota es un globo gigante, generando risas y caídas.",
            imageUrl = "",
            date = "",
            author = ""
        )
    )
)

/**
 * Mock de noticias de economía.
 * @author Daniel Figueroa
 */
val economyNewsMock = CategoryModel(
    id = 3,
    title = "Economía",
    items = listOf(
        NewsModel(
            id = 13,
            title = "Banco lanza tarjeta que solo funciona con sonrisa",
            description = "Nueva tarjeta de crédito valida pagos solo si detecta una sonrisa en el usuario.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 14,
            title = "Mercado de pulgas ahora acepta trueque de memes virales",
            description = "Vendedores intercambian productos por memes graciosos en redes sociales.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 15,
            title = "Empresa paga en criptomonedas de chocolate para motivar empleados",
            description = "Los pagos son dulces y virtuales; empleados felices pero con ganas de más.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 16,
            title = "Inversionistas compran acciones de pizzerías… solo por amor al queso",
            description = "Mercado bursátil con acciones seleccionadas según el tipo y cantidad de queso.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 17,
            title = "Startup crea app que calcula el precio del café según tu estado de ánimo",
            description = "Cambia el coste y tipo de café a comprar según cómo te sientes.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 18,
            title = "Gobierno lanza billetes que cambian de color según la inflación",
            description = "Billetes que visualmente alertan sobre la situación económica actual.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 19,
            title = "Tienda vende aire embotellado de ciudades famosas",
            description = "Fragancias únicas y souvenirs que incluyen aire “fresco” de París, Nueva York y Tokio.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 20,
            title = "Aplicación que predice si gastarás o ahorrarás con base en el pronóstico del tiempo",
            description = "Combina datos meteorológicos con hábitos de gasto personal para aconsejar finanzas.",
            imageUrl = "",
            date = "",
            author = ""
        )
    )
)

/**
 * Mock de noticias de desarrollo.
 * @author Daniel Figueroa
 */
val developerNewsMock = CategoryModel(
    id = 4,
    title = "Desarrollo",
    items = listOf(
        NewsModel(
            id = 21,
            title = "Programador crea algoritmo que escribe memes automáticamente",
            description = "Inteligencia artificial que genera memes y los comparte sin supervisión.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 22,
            title = "Error en código causa que aplicación se cierre solo en lunes",
            description = "Bug peculiar que discrimina días de la semana.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 23,
            title = "Hackers usan emojis para esconder mensajes secretos",
            description = "Comunicación cifrada mediante combinaciones de emojis populares.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 24,
            title = "Programadores compiten a quién hace el código más corto pero más confuso",
            description = "Concurso con premios al código más difícil de entender.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 25,
            title = "App que te da consejos para procrastinar mejor según tu tipo de trabajo",
            description = "Herramienta para maximizar el arte de aplazar tareas.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 26,
            title = "Bot que responde “Hola Mundo” a cualquier pregunta técnica",
            description = "Inteligencia artificial limitada pero simpática.",
            imageUrl = "",
            date = "",
            author = ""
        )
    )
)

/**
 * Mock de noticias de geografía.
 * @author Daniel Figueroa
 */
val geographyNewsMock = CategoryModel(
    id = 5,
    title = "Geografía",
    items = listOf(
        NewsModel(
            id = 27,
            title = "Mapa interactivo muestra dónde están todos los puntos WiFi gratuitos y bares con karaoke",
            description = "Combina ocio y conectividad para turistas y locales.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 28,
            title = "Isla misteriosa aparece en el océano con forma de emoji sonriente",
            description = "Geógrafos desconcertados por la forma natural tan peculiar.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 29,
            title = "Montaña cambia de color según el ánimo de los visitantes",
            description = "Sensor de emociones que altera luces LED en senderos.",
            imageUrl = "",
            date = "",
            author = ""
        ),
        NewsModel(
            id = 30,
            title = "Nuevo país propone usar el saludo con choque de codos como norma oficial",
            description = "Medida para promover salud y evitar contagios.",
            imageUrl = "",
            date = "",
            author = ""
        )
    )
)

/**
 * Mock general que contiene todas las secciones de la aplicación.
 * @author Daniel Figueroa
 */
val newsSummaryMock = NewsSummaryModel(
    headerNews = NewsModel(
        id = 31,
        title = "Vecino construye castillo de cartón para protegerse de los lunes",
        description = "Después de muchos lunes difíciles, un vecino decidió construir un castillo de cartón en su salón para “escapar” de la rutina semanal. Ahora recibe visitas curiosas y hasta organiza tours guiados para sus amigos.",
        imageUrl = "https://www.franciscomlopez.com/openWebinars25/header_news.png",
        date = "1 May 2025",
        author = ""
    ),
    categories = listOf(
        latestNewsMock,
        sportNewsMock,
        economyNewsMock,
        developerNewsMock,
        geographyNewsMock
    ),
    weather = WeatherModel(
        type = WeatherConditionType.Sunny,
        temperature = 22,
        description = "Soleado todo el día"
    )
)
