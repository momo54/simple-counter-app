import requests

API_URL = "https://localhost:8443/api/counter"

def test_get_counter():
    response = requests.get(API_URL, verify=False)
    assert response.status_code == 200
    assert response.text.isdigit()

def test_increment_counter():
    response = requests.post(f"{API_URL}/increment", verify=False)
    assert response.status_code == 200

def test_counter_increments():
    before = int(requests.get(API_URL,verify=False).text)
    requests.post(f"{API_URL}/increment", verify=False)
    after = int(requests.get(API_URL,verify=False).text)
    assert after == before + 1
