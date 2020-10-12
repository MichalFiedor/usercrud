package pl.coderslab.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class UTF8_Filter implements Filter {
    private String charsetEncoding = "utf-8";
    private String contentType = "text/html";

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        req.setCharacterEncoding(charsetEncoding);
        resp.setContentType(contentType);
        resp.setCharacterEncoding(charsetEncoding);
        chain.doFilter(req, resp);

    }

    public void destroy() {
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
