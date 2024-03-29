# Ürün Kontrolcüsü API Sürümleme

Bu projede, bir ürün kontrolcüsü API'sini farklı sürümleme stratejileri kullanarak oluşturduk. Aşağıda kullanılan sürümleme stratejileri ve bunların nasıl çalıştığı hakkında bilgi verilmiştir.

## URI Sürümleme

URI sürümleme, API sürümünü URI'nin bir parçası olarak belirtir. Farklı sürümler farklı URI'ler altında sunulur. Örneğin:

- **V1**: `GET /api/v1/product`
- **V2**: `GET /api/v2/product`

## Parametre Sürümleme

Parametre sürümleme, API sürümünü bir parametre olarak URI'ye ekler. İstemci, hangi sürümün istendiğini belirlemek için bu parametreyi kullanır. Örneğin:

- **V1**: `GET /api/param/product?apiVersion=1`
- **V2**: `GET /api/param/product?apiVersion=2`

## Başlık Sürümleme

Başlık sürümleme, API sürümünü isteğin başlığında belirtir. İstemci, sürümü `X-API-VERSION` başlığında belirterek istekte bulunur. Örneğin:

- **V1**: `GET /api/header/product` (X-API-VERSION: 1)
- **V2**: `GET /api/header/product` (X-API-VERSION: 2)

Bu üç farklı sürümleme stratejisi, farklı kullanım senaryolarına ve gereksinimlere uyum sağlar. Projenin gereksinimlerine ve tercihlerinize göre uygun olan sürümleme stratejisini seçebilirsiniz.
