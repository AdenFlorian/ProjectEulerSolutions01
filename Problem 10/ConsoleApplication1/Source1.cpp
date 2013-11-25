string regcheck () {
    HKEY key;
    if (RegOpenKeyEx(HKEY_LOCAL_MACHINE, TEXT("SOFTWARE\\Wow6432Node\\Bohemia Interactive\\Arma 3\\"), NULL, KEY_READ, &key) != ERROR_SUCCESS){
        return "error";
    } else {
        unsigned char value[128] = {'\0'};
        DWORD value_length;
        DWORD Type = REG_SZ;
        RegQueryValueEx(key, TEXT("MAIN"), NULL, &Type, value,&value_length);
 
        string arma3directory;
        for (int i = 0; i < 128; i++) {
            if (i % 2 == 0) {
                arma3directory += value[i];
            }
        }
        RegCloseKey(key);
        return arma3directory;
    }
 
}