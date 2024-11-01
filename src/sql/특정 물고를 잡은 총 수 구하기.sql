SELECT COUNT(*) AS FISH_COUNT
FROM FISH_INFO fi
         JOIN FISH_NAME_INFO fn ON fi.FISH_TYPE = fn.FISH_TYPE
WHERE fn.FISH_NAME IN ('BASS', 'SNAPPER');