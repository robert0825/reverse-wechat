package oicq.wlogin_sdk.tools;

import java.util.Random;

public final class d
{
  public static byte[] b(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = new byte[paramInt];
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 0, paramInt);
    paramArrayOfByte1 = new a();
    int i = arrayOfByte.length;
    paramArrayOfByte1.plain = new byte[8];
    paramArrayOfByte1.prePlain = new byte[8];
    paramArrayOfByte1.pos = 1;
    paramArrayOfByte1.padding = 0;
    paramArrayOfByte1.preCrypt = 0;
    paramArrayOfByte1.crypt = 0;
    paramArrayOfByte1.key = paramArrayOfByte2;
    paramArrayOfByte1.header = true;
    paramArrayOfByte1.pos = ((i + 10) % 8);
    if (paramArrayOfByte1.pos != 0) {
      paramArrayOfByte1.pos = (8 - paramArrayOfByte1.pos);
    }
    paramArrayOfByte1.out = new byte[paramArrayOfByte1.pos + i + 10];
    paramArrayOfByte1.plain[0] = ((byte)(paramArrayOfByte1.random.nextInt() & 0xF8 | paramArrayOfByte1.pos));
    paramInt = 1;
    if (paramInt > paramArrayOfByte1.pos)
    {
      paramArrayOfByte1.pos += 1;
      paramInt = 0;
      label161:
      if (paramInt < 8) {
        break label232;
      }
      paramArrayOfByte1.padding = 1;
    }
    for (;;)
    {
      if (paramArrayOfByte1.padding > 2)
      {
        paramInt = i;
        i = 0;
        if (paramInt > 0) {
          break label313;
        }
        paramArrayOfByte1.padding = 1;
        label193:
        if (paramArrayOfByte1.padding <= 7) {
          break label385;
        }
        return paramArrayOfByte1.out;
        paramArrayOfByte1.plain[paramInt] = ((byte)(paramArrayOfByte1.random.nextInt() & 0xFF));
        paramInt += 1;
        break;
        label232:
        paramArrayOfByte1.prePlain[paramInt] = 0;
        paramInt += 1;
        break label161;
      }
      if (paramArrayOfByte1.pos < 8)
      {
        paramArrayOfByte2 = paramArrayOfByte1.plain;
        paramInt = paramArrayOfByte1.pos;
        paramArrayOfByte1.pos = (paramInt + 1);
        paramArrayOfByte2[paramInt] = ((byte)(paramArrayOfByte1.random.nextInt() & 0xFF));
        paramArrayOfByte1.padding += 1;
      }
      if (paramArrayOfByte1.pos == 8) {
        paramArrayOfByte1.encrypt8Bytes();
      }
    }
    label313:
    int j;
    if (paramArrayOfByte1.pos < 8)
    {
      paramArrayOfByte2 = paramArrayOfByte1.plain;
      int k = paramArrayOfByte1.pos;
      paramArrayOfByte1.pos = (k + 1);
      j = i + 1;
      paramArrayOfByte2[k] = arrayOfByte[i];
      i = paramInt - 1;
      paramInt = j;
    }
    for (;;)
    {
      if (paramArrayOfByte1.pos == 8) {
        paramArrayOfByte1.encrypt8Bytes();
      }
      j = i;
      i = paramInt;
      paramInt = j;
      break;
      label385:
      if (paramArrayOfByte1.pos < 8)
      {
        paramArrayOfByte2 = paramArrayOfByte1.plain;
        paramInt = paramArrayOfByte1.pos;
        paramArrayOfByte1.pos = (paramInt + 1);
        paramArrayOfByte2[paramInt] = 0;
        paramArrayOfByte1.padding += 1;
      }
      if (paramArrayOfByte1.pos != 8) {
        break label193;
      }
      paramArrayOfByte1.encrypt8Bytes();
      break label193;
      j = paramInt;
      paramInt = i;
      i = j;
    }
  }
  
  public static byte[] decrypt(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte1, paramInt1, arrayOfByte, 0, paramInt2);
    a locala = new a();
    int k = arrayOfByte.length;
    locala.preCrypt = 0;
    locala.crypt = 0;
    locala.key = paramArrayOfByte2;
    paramArrayOfByte1 = new byte[8];
    if ((k % 8 != 0) || (k < 16)) {
      return null;
    }
    locala.prePlain = locala.decipher(arrayOfByte, 0);
    locala.pos = (locala.prePlain[0] & 0x7);
    paramInt2 = k - locala.pos - 10;
    if (paramInt2 < 0) {
      return null;
    }
    paramInt1 = 0;
    if (paramInt1 >= 8)
    {
      locala.out = new byte[paramInt2];
      locala.preCrypt = 0;
      locala.crypt = 8;
      locala.contextStart = 8;
      locala.pos += 1;
      locala.padding = 1;
    }
    for (;;)
    {
      label168:
      int i;
      if (locala.padding > 2)
      {
        paramInt1 = paramInt2;
        i = 0;
      }
      for (;;)
      {
        label182:
        if (paramInt1 == 0) {}
        int j;
        for (locala.padding = 1;; locala.padding += 1)
        {
          if (locala.padding >= 8)
          {
            return locala.out;
            paramArrayOfByte1[paramInt1] = 0;
            paramInt1 += 1;
            break;
            if (locala.pos < 8)
            {
              locala.pos += 1;
              locala.padding += 1;
            }
            if (locala.pos != 8) {
              break label168;
            }
            if (locala.decrypt8Bytes(arrayOfByte, 0, k)) {
              break label515;
            }
            return null;
            j = i;
            paramInt2 = paramInt1;
            if (locala.pos < 8)
            {
              locala.out[i] = ((byte)(paramArrayOfByte1[(locala.preCrypt + 0 + locala.pos)] ^ locala.prePlain[locala.pos]));
              j = i + 1;
              paramInt2 = paramInt1 - 1;
              locala.pos += 1;
            }
            i = j;
            paramInt1 = paramInt2;
            if (locala.pos != 8) {
              break label182;
            }
            locala.preCrypt = (locala.crypt - 8);
            if (locala.decrypt8Bytes(arrayOfByte, 0, k)) {
              break label503;
            }
            return null;
          }
          if (locala.pos < 8)
          {
            if ((paramArrayOfByte1[(locala.preCrypt + 0 + locala.pos)] ^ locala.prePlain[locala.pos]) != 0) {
              return null;
            }
            locala.pos += 1;
          }
          if (locala.pos == 8)
          {
            locala.preCrypt = locala.crypt;
            if (!locala.decrypt8Bytes(arrayOfByte, 0, k)) {
              return null;
            }
            paramArrayOfByte1 = arrayOfByte;
          }
        }
        label503:
        paramArrayOfByte1 = arrayOfByte;
        i = j;
        paramInt1 = paramInt2;
      }
      label515:
      paramArrayOfByte1 = arrayOfByte;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\tools\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */