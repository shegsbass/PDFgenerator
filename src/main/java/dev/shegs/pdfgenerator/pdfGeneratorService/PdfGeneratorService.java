package dev.shegs.pdfgenerator.pdfGeneratorService;

import com.lowagie.text.Document;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

@Service
public class PdfGeneratorService {

    public void export(HttpServletResponse response){
        Document document = new Document();
    }

}
