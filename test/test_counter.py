import requests

API_URL = "http://localhost:8080/api/counter"

def test_get_counter():
    response = requests.get(API_URL)
    assert response.status_code == 200
    assert response.text.isdigit()

def test_increment_counter():
    response = requests.post(f"{API_URL}/increment")
    assert response.status_code == 200

def test_counter_increments():
    before = int(requests.get(API_URL).text)
    requests.post(f"{API_URL}/increment")
    after = int(requests.get(API_URL).text)
    assert after == before + 1
