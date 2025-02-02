from playwright.sync_api import sync_playwright

def test_homepage_title():
    with sync_playwright() as p:
        browser = p.chromium.launch(headless=True)  # Mode headless (sans interface graphique)
        page = browser.new_page()
        page.goto("http://localhost:8080")  # Adapter à ton application
        assert "Counter App" in page.title()  # Vérifie le titre de la page
        browser.close()
