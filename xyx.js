export default async function handler(req, res) {
    const { q } = req.query;
    const response = await fetch(`https://api.mapbox.com/geocoding/
        v5/mapbox.places/${q}.json?access_token=$
        {process.env.MAPBOX_TOKEN}`);
    const data = await response.json();
    res.status(200).json(data);
  }
  