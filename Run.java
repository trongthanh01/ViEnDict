public class Run {
    public static void main(String[] args) {
        DictionaryCommandline dictCom = new DictionaryCommandline();
        dictCom.dictionaryBasic();
        //dictCom.dictionaryAdvanced();
        dictCom.dictManage.addWord();
        //dictCom.dictionarySearcher();
        dictCom.dictManage.deleteWord("hello");
        dictCom.showAllWords();
        dictCom.dictManage.dictionaryExportToFile();
    }
}
