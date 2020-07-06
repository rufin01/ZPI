# Instrukcja (depricated)

## Instalacja ANTLR'a:
poradniki:

video -> [film](https://www.youtube.com/watch?v=-FdD_xzNFL4)

strona dedykowana narzędziu -> [antlr.org](https://www.antlr.org/)

## Testowanie składni:

### w folderze `/antlr`

```
	antlr4 -visitor Expr.g4
```

```
	javac *.java
```

### w folderze o jeden wyżej - tutaj -> `/src`

```
	grun antlr.Expr prog tests/test0.txt -gui &
```

## Opis:

Najważniejszym plikiem do którego trzeba zajrzeć jest **Expr.g4** _(Nie sugerujcie się nazwą, jest to pozostałość po zrzynaniu z poradnika)_, który definiuję składnię języka.

Pozostałe pliki w folderze ```/antlr``` są póki co nieistotne

Za semantykę odpowiadają pliki w folderze ```/expression```, które nie są jeszcze dokończone _(jako, że nie wiadomo jak zdefiniować grafy... również nie czuję się na tyle dobry, żeby definiować działanie czegokolwiek bez konsultacji)_.

## Stan projektu

Na ten moment w pełni działającym elementem kompilatora jest budowanie tzw. <span style="color: #EFD020">ParseTree</span>, oraz sprawdzanie poprawności wpisywanego kodu pod względem składni językowej. 

Moduł kompilatora odpowiadający za rozumienie oraz wykonanie podanego kodu jest rozpoczęty, jednak ubogi. Kompilator jest budowany za pomocą wzorca(?) <span style="color: #EFD020">visitor</span>