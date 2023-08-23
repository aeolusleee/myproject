import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.github.houbb.opencc4j.util.ZhConverterUtil;
import com.github.houbb.opencc4j.util.ZhTwConverterUtil;

public class TransWord {
	public static void main(String[] args) {
		// 檔案路徑
        String filePath = "C:\\Users\\aeolu\\Downloads\\劍來\\halfgod_old.txt";

        try {
            // 讀取檔案
            File inputFile = new File(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // 寫入檔案
            File outputFile = new File("C:\\Users\\aeolu\\Downloads\\劍來\\\\halfgod_new.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                // 簡體轉繁體
                String traditional = ZhTwConverterUtil.toTraditional(line);
                // 寫入檔案
                writer.write(traditional);
                writer.newLine();
            }

            // 關閉資源
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
