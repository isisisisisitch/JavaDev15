package ca.bytetube._12_anonymous;


public class Files {

    public interface Filter {

        public boolean accept(String fileName);

    }


    public static String[] getAllFilesName(String dir, Filter filter) {

        //1.先获取dir目录下的所有文件名
        String[] allFilesNames = {"static_final.docx", "static_final.pdf", "..."};
        //2.筛选
        String[] acceptableFilesNames = null;
        for (String fileName : allFilesNames) {
            if( filter.accept(fileName)){
               //将满足条件的文件打包
                //acceptableFilesNames
            }

        }

        //3.返回所有打包的文件
        return acceptableFilesNames;


    }
}
