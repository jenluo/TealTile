package com.TealTile.Service;

import com.TealTile.Dao.CanvasDao;
import org.springframework.stereotype.Service;

@Service
public class CanvasService {
    CanvasDao canvasDao;

    public void updateMap(String projID, int tile, int oldValue, int newValue) {}

    public void openMapSettings(String projID) {}
}
