package jsonstart;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import io.restassured.response.Response;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TsetNGstudy {

    @Test(dataProvider = "datas")
    public void Test0421(Caseinfo caseinfo) {
        String url = "{\"principal\":\""+caseinfo.getUsername()+"\",\"credentials\":\""+caseinfo.getPassword()+"\",\"appType\":3,\"loginType\":0}";
        Response rse =  APICall.login(url);

        //System.out.println(rse.getStatusCode());
        Assert.assertEquals(rse.getStatusCode(),200);

    }


    @DataProvider
    public Object[] datas() throws Exception {
        ImportParams importParams = new ImportParams();
        //importParams.setStartSheetIndex(0);
        //importParams.setStartRows(1);
        FileInputStream fileInputStream = new FileInputStream("src\\test\\resources\\lemon_login_test.xlsx");
        //Workbook workbook = WorkbookFactory.create(fileInputStream);
        List<Caseinfo> list = ExcelImportUtil.importExcel(fileInputStream,Caseinfo.class,importParams);

        return list.toArray();

    }
}
