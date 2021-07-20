package sample;

import java.util.Random;

public enum Words {
    //features("функции/особенности"),
    //brevity("краткость"),
    //preference("предпочтение"),
    //reasonably("достаточно/разумно"),
    //favor("предпочитать"),
    //in_order("для того, чтобы"),
    //boilerplate("шаблонный"),
    //similarly("аналогично"),
    //omit("не включать/пропускать"),
    //terms("термины/условия"),
    //reference("ссылка/отсылка"),
    //instance("экземпляр"),
    //consist("состоять"),
    //apply("применять"),
    //commit("совершать/обязывать"),
    //coincidence("совпадение"),
    //loosely("свободно"),
    //timely_manner("своевременно"),
    //precede("предшествовать"),
    //indispensable("незаменимый"),
    //attentive("внимательный"),
    //distinct("отчётливый"),
    //vital("жизненно важный"),
    //eligible("подходящий"),
    //argue("спорить/аргументировать"),
    //dissecting("анализировать/разбирать"),
    //effort("усилие"),
    //tend("тенденция"),
    temperate("умеренный"),
    deciduous("лиственный"),
    intersperse("вкрапливать"),
    clearings("поляны"),
    marble("мрамор"),
    limestone("известняк"),
    forage("корм"),
    graze("пасти"),
    frequency("частота"),
    coast("побережье"),
    flaw("недостаток/изъян"),
    grumpy("сердитый"),
    recreation("отдых"),
    sow("сеять"),
    flammability("воспламеняемость"),
    yields("доходность"),
    edible("съедобный"),
    soil("почва"),
    nutritional("питательный"),
    stove("плита"),
    extinguish("тушить"),
    porch("крыльцо"),
    club("дубина"),
    amass("копить"),
    reinforce("усиливать"),
    accelerate("ускорять"),
    blunt("самокрутка"),
    regurgitate("извергать"),
    intimidate("запугивать")
    ;

    private String word;

    public String getWord() {
        return this.word;
    }

    Words(String word) {
        this.word = word;
    }

    public static Words getRandomWord() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
