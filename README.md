"# NewsRest" 
которое будет загружать из API https://api.tinkoff.ru/v1/news заголовки новостей банка и показывать их в виде списка.
В каждом элементе списка i должен отображаться текст из поля payload[i].text. Список должен быть отсортирован по полю publicationDate по убыванию. Полученные данные должны кешироваться на клиенте. Данные должны обновляться после оттягивания (pull-to-refresh).
При нажатии на каждую новость, она должна открывать новый экран и показывать содержимое (payload.content) загруженное из API https://api.tinkoff.ru/v1/news_content?id={ payload[i].id}. Уделять много внимания дизайну не стоит, но чистый аккуратный интерфейс обязателен.
Приложение должно быть написано на Java или Kotlin. При реализации можно пользоваться любыми привычными инструментами/библиотеками.
Выполненное задание нужно предоставить в виде исходников выложенных на github или Bitbucket





{"resultCode":"OK","payload":
                           [
                           {"id":"10024","name":"20122017-tinkoff-bank-x-mgu","text":"Тинькофф Банк начинает сотрудничество с кафедрой математических и компьютерных методов анализа мехмата МГУ","publicationDate":{"milliseconds":1513767691000},"bankInfoTypeId":2},
                           {"id":"10004","name":"19122017-tinkoff-x-garmin-pay","text":"Тинькофф Банк запускает Garmin Pay","publicationDate":{"milliseconds":1513684913000},"bankInfoTypeId":2},
                           ],"trackingId":"6JR2KEV6N"}