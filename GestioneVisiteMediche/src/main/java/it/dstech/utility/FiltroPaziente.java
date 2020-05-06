package it.dstech.utility;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.dstech.model.Utente;

@WebFilter(filterName = "filtroPaziente", urlPatterns = "/paziente/*")

public class FiltroPaziente implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpSession sessione = ((HttpServletRequest) request).getSession();
		Utente utente = (Utente) sessione.getAttribute("Utente");
		System.out.println("sono nel filtro paziente");

		if ("paziente".equals(utente.getRuolo())) {
			chain.doFilter(request, response);
		} else {

			HttpServletResponse resp = (HttpServletResponse) response;
			resp.sendRedirect("login.jsp");
		}
	}

	@Override
	public void destroy() {

	}

}
