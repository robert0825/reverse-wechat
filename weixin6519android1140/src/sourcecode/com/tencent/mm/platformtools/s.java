package com.tencent.mm.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

public final class s
{
  public int contextStart;
  public int crypt;
  private boolean header;
  public byte[] key;
  public byte[] out;
  public int padding;
  private byte[] plain;
  public int pos;
  public int preCrypt;
  public byte[] prePlain;
  private Random random;
  
  public s()
  {
    GMTrace.i(470835789824L, 3508);
    this.header = true;
    this.random = new Random();
    GMTrace.o(470835789824L, 3508);
  }
  
  private byte[] encipher(byte[] paramArrayOfByte)
  {
    GMTrace.i(471238443008L, 3511);
    int i = 16;
    for (;;)
    {
      long l3;
      long l2;
      long l4;
      long l5;
      long l6;
      long l7;
      long l1;
      try
      {
        l3 = k(paramArrayOfByte, 0);
        l2 = k(paramArrayOfByte, 4);
        l4 = k(this.key, 0);
        l5 = k(this.key, 4);
        l6 = k(this.key, 8);
        l7 = k(this.key, 12);
        l1 = 0L;
      }
      catch (IOException paramArrayOfByte)
      {
        DataOutputStream localDataOutputStream;
        GMTrace.o(471238443008L, 3511);
        return null;
      }
      paramArrayOfByte = new ByteArrayOutputStream(8);
      localDataOutputStream = new DataOutputStream(paramArrayOfByte);
      localDataOutputStream.writeInt((int)l3);
      localDataOutputStream.writeInt((int)l2);
      localDataOutputStream.close();
      paramArrayOfByte = paramArrayOfByte.toByteArray();
      GMTrace.o(471238443008L, 3511);
      return paramArrayOfByte;
      while (i > 0)
      {
        l1 = l1 + 2654435769L & 0xFFFFFFFF;
        l3 = l3 + ((l2 << 4) + l4 ^ l2 + l1 ^ (l2 >>> 5) + l5) & 0xFFFFFFFF;
        l2 = l2 + ((l3 << 4) + l6 ^ l3 + l1 ^ (l3 >>> 5) + l7) & 0xFFFFFFFF;
        i -= 1;
      }
    }
  }
  
  private void encrypt8Bytes()
  {
    GMTrace.i(471506878464L, 3513);
    this.pos = 0;
    byte[] arrayOfByte;
    int i;
    if (this.pos < 8)
    {
      if (this.header)
      {
        arrayOfByte = this.plain;
        i = this.pos;
        arrayOfByte[i] = ((byte)(arrayOfByte[i] ^ this.prePlain[this.pos]));
      }
      for (;;)
      {
        this.pos += 1;
        break;
        arrayOfByte = this.plain;
        i = this.pos;
        arrayOfByte[i] = ((byte)(arrayOfByte[i] ^ this.out[(this.preCrypt + this.pos)]));
      }
    }
    System.arraycopy(encipher(this.plain), 0, this.out, this.crypt, 8);
    for (this.pos = 0; this.pos < 8; this.pos += 1)
    {
      arrayOfByte = this.out;
      i = this.crypt + this.pos;
      arrayOfByte[i] = ((byte)(arrayOfByte[i] ^ this.prePlain[this.pos]));
    }
    System.arraycopy(this.plain, 0, this.prePlain, 0, 8);
    this.preCrypt = this.crypt;
    this.crypt += 8;
    this.pos = 0;
    this.header = false;
    GMTrace.o(471506878464L, 3513);
  }
  
  private static long k(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(470970007552L, 3509);
    long l = 0L;
    int i = paramInt;
    while (i < paramInt + 4)
    {
      l = l << 8 | paramArrayOfByte[i] & 0xFF;
      i += 1;
    }
    GMTrace.o(470970007552L, 3509);
    return l & 0xFFFFFFFF;
  }
  
  public final byte[] decipher(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(471372660736L, 3512);
    paramInt = 16;
    for (;;)
    {
      long l3;
      long l2;
      long l4;
      long l5;
      long l6;
      long l7;
      long l1;
      try
      {
        l3 = k(paramArrayOfByte, 0);
        l2 = k(paramArrayOfByte, 4);
        l4 = k(this.key, 0);
        l5 = k(this.key, 4);
        l6 = k(this.key, 8);
        l7 = k(this.key, 12);
        l1 = 3816266640L;
      }
      catch (IOException paramArrayOfByte)
      {
        DataOutputStream localDataOutputStream;
        GMTrace.o(471372660736L, 3512);
        return null;
      }
      paramArrayOfByte = new ByteArrayOutputStream(8);
      localDataOutputStream = new DataOutputStream(paramArrayOfByte);
      localDataOutputStream.writeInt((int)l3);
      localDataOutputStream.writeInt((int)l2);
      localDataOutputStream.close();
      paramArrayOfByte = paramArrayOfByte.toByteArray();
      GMTrace.o(471372660736L, 3512);
      return paramArrayOfByte;
      while (paramInt > 0)
      {
        l2 = l2 - ((l3 << 4) + l6 ^ l3 + l1 ^ (l3 >>> 5) + l7) & 0xFFFFFFFF;
        l3 = l3 - ((l2 << 4) + l4 ^ l2 + l1 ^ (l2 >>> 5) + l5) & 0xFFFFFFFF;
        l1 = l1 - 2654435769L & 0xFFFFFFFF;
        paramInt -= 1;
      }
    }
  }
  
  public final boolean decrypt8Bytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(471641096192L, 3514);
    for (this.pos = 0; this.pos < 8; this.pos += 1)
    {
      if (this.contextStart + this.pos >= paramInt2)
      {
        GMTrace.o(471641096192L, 3514);
        return true;
      }
      byte[] arrayOfByte = this.prePlain;
      paramInt1 = this.pos;
      arrayOfByte[paramInt1] = ((byte)(arrayOfByte[paramInt1] ^ paramArrayOfByte[(this.crypt + 0 + this.pos)]));
    }
    this.prePlain = decipher(this.prePlain, 0);
    if (this.prePlain == null)
    {
      GMTrace.o(471641096192L, 3514);
      return false;
    }
    this.contextStart += 8;
    this.crypt += 8;
    this.pos = 0;
    GMTrace.o(471641096192L, 3514);
    return true;
  }
  
  public final byte[] encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(471104225280L, 3510);
    int j = paramArrayOfByte1.length;
    this.plain = new byte[8];
    this.prePlain = new byte[8];
    this.pos = 1;
    this.padding = 0;
    this.preCrypt = 0;
    this.crypt = 0;
    this.key = paramArrayOfByte2;
    this.header = true;
    this.pos = ((j + 10) % 8);
    if (this.pos != 0) {
      this.pos = (8 - this.pos);
    }
    this.out = new byte[this.pos + j + 10];
    this.plain[0] = ((byte)(this.random.nextInt() & 0xF8 | this.pos));
    int i = 1;
    while (i <= this.pos)
    {
      this.plain[i] = ((byte)(this.random.nextInt() & 0xFF));
      i += 1;
    }
    this.pos += 1;
    i = 0;
    while (i < 8)
    {
      this.prePlain[i] = 0;
      i += 1;
    }
    this.padding = 1;
    while (this.padding <= 2)
    {
      if (this.pos < 8)
      {
        paramArrayOfByte2 = this.plain;
        i = this.pos;
        this.pos = (i + 1);
        paramArrayOfByte2[i] = ((byte)(this.random.nextInt() & 0xFF));
        this.padding += 1;
      }
      if (this.pos == 8) {
        encrypt8Bytes();
      }
    }
    i = 0;
    if (j > 0)
    {
      if (this.pos >= 8) {
        break label436;
      }
      paramArrayOfByte2 = this.plain;
      int m = this.pos;
      this.pos = (m + 1);
      int k = i + 1;
      paramArrayOfByte2[m] = paramArrayOfByte1[i];
      j -= 1;
      i = k;
    }
    label436:
    for (;;)
    {
      if (this.pos == 8)
      {
        encrypt8Bytes();
        break;
        this.padding = 1;
        while (this.padding <= 7)
        {
          if (this.pos < 8)
          {
            paramArrayOfByte1 = this.plain;
            i = this.pos;
            this.pos = (i + 1);
            paramArrayOfByte1[i] = 0;
            this.padding += 1;
          }
          if (this.pos == 8) {
            encrypt8Bytes();
          }
        }
        paramArrayOfByte1 = this.out;
        GMTrace.o(471104225280L, 3510);
        return paramArrayOfByte1;
      }
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\platformtools\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */