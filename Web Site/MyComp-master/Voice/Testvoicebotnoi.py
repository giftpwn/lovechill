URL: https://api-voice.botnoi.ai/api/service/generate_audio
{
  "text": "สวัสดี",
  "speaker": "1",
  "volume": 1,
  "speed": 1,
  "type_media": "m4a"
}

import requests
url = "https://api-voice.botnoi.ai/api/service/generate_audio"
payload = {"text":"สวัสดี", "speaker":"1", "volume":1, "speed":1, "type_media":"m4a"}
headers = {
  'Botnoi-Token': 'c3d7f68e4f670616f589979e747cc164209e9e0c1a1c6f10e575231d6aa8bd78',
  'Content-Type': 'application/json'
}
response = requests.request("POST", url, headers=headers, json=payload)
print(response.json())
