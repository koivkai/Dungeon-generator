## Dungeon generator

### Yleistä

Dungeon generator:in tarkoitus on tuottaa satunnaisia luolasto karttoja käytettäväksi dungeons and dragons -roolipelissä. Koska itse käytän pelin varianttia, jossa pelataan neliöruudukossa, kartat tulevat neliruudukkoon. Kartat tulevat koostumaan erikoisista neliön muotoisista huoneista ja niitä yhdistävistä oviaukoista ja käytävistä. Tuloksena on kuva luodusta kartasta.

### Mitä algoritmeja ja tietorakenteita toteutat työssäsi

Ohjelman tärkein osa on luolaston generoiva algoritmi ja joko sen osana tai erikseen generoitujen huoneiden ja käytävien asettaminen ruudukkoon. Huoneet tallennetaan **verkkoon**. Kartta muodostuu **kaksiulotteista taulukosta**. Generointi algoritmi tulee hyödyntämään **jonoa**. 

## Mitä ongelmaa ratkaiset ja miksi valitsit kyseiset algoritmit/tietorakenteet

Keskeisin tai ainakin vaikein ongelma tulee todennäköisesti olemaan huoneiden asettelu ruudukkoon. Verkko on luontainen tapa kuvata toisiinsa liittyviä huoneita.

## Mitä syötteitä ohjelma saa ja miten näitä käytetään

Ainakin alkuun ohjelma saa huoneiden maksimimäärän ja halutun yhdistyneisyys tason huoneiden välillä (eli kuinka moneen huoneeseen jokaisesta huoneesta on keskimäärin toisiin huoneisiin). Syötteet annetaan graafisessa käyttöliittymässä.

## Tavoitteena olevat aika- ja tilavaativuudet 

Aikavaativuuteen tulevat eniten vaikuttamaan huoneiden määrä, yhteyksien määrä huoneiden välillä y, sekä niiden laittaminen ruudukkoon eli ruudukon koko n. Pahimmillaan jokaisesta huoneesta voisi olla yhteys toiseen huoneeseen, mikä voisi tuottaa neliöllisen aikavaativuuden. Huoneita ei tule olemaan kuin korkeintaan satoja, joten neliöllinenkin aikavaativuus huoneiden määrän suhteen olisi riittävän nopea. Huoneiden ei ole myöskään järkevää olla kovin suuria, joten suuremmallekin kartalle riittänee 1000x1000 ruudukko. Siispä aikavaativuuden suhteessa ruutujen määrään pitäisi mieluiten olla lineaarinen. Tilavaativuus tulee riippuman lineaarisesti huoneiden määrästä ja ruudukon koosta. 

### Tavoitteet aikavaativuudelle:
Huoneiden määrän suhteen neliöllinen tai parempi
Ruudukon kokoon nähden lineaarinen
### Tavoitteet tilavaativuudelle:
Lineaarinen sekä huoneiden määrään että ruudukon kokoon nähden.

