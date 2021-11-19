När du hämtat filerna så kommer du se att dom ligger i två olika paket.
Detta är för att det finns två Mainmetoder. Dom ligger i olika paket för att inte krocka med varandra. 

För att köra Mainfilen så behöver du skriva in argument i form av siffror. På intelliJ så skriver du in argument genom att klicka på "Run", och därefter klicka på "Edit Configuration". 

Du kommer då få upp en ruta med olika fält. Under Application uppe i vänster hörn ser du de olika filerna som är hämtade. Klicka på "Main" och fyll sedan i fältet där det står "Program Arguments".

Fyll enbart i siffror. Negativa tal går också bra. Det viktiga att tänka på är att enbart ha mellanslag mellan siffrorna och inte kommatecken. Exempel: 1 3 -10 25

När du skrivit in argumenten så trycker du på "Apply" och därefter "Ok" för att spara ändringarna. 

Nu kan du exekvera programmet genom att klicka på "Run" och sedan "Run Main". Siffrorna ska därefter sorteras i storleksordning. Minsta talet först upp till det största.
Sorteringen är möjlig för att vi hämtar metoden "sortering" från "Sorter.java".

För att testa vår metod "sortering" som vi hittar i "Sorter.java" så finns det 5 olika metoder i filen "TestFil.java". 
För att exekvera testfilen så måste du gå till paketet "Testfilen". I den mappen/paketet så hittat du programmet som testar sorteringsalgoritmen.

Du kan se att vi har importerat sorteringsalgoritmen på rad 2 "Import Sorter.Sorter;".

Där ser vi 5 olika metoder som testar 5 olika utfall på listor. När du kör programmet så ser du att samtliga listor blir godkända. 
Där ser vi de osorterade listorna som vi sedan ger till sorteringsalgoritmen som spottar ut våra förväntade reslutat. 

Under våra förväntade resultat så sker det en jämförelse mellan vårt reslutat och det förvätnade utfallet. Om dom är identiska så kommer metoden att printa ut ett "Godkänt". Om dom inte stämmer överens så printas ingenting ut.
