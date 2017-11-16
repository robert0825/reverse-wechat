package com.tencent.tmassistantsdk.util;

import java.io.UnsupportedEncodingException;

public class Base64
{
  public static final int CRLF = 4;
  public static final int DEFAULT = 0;
  public static final int NO_CLOSE = 16;
  public static final int NO_PADDING = 1;
  public static final int NO_WRAP = 2;
  public static final int URL_SAFE = 8;
  
  static
  {
    if (!Base64.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  public static byte[] decode(String paramString, int paramInt)
  {
    return decode(paramString.getBytes(), paramInt);
  }
  
  public static byte[] decode(byte[] paramArrayOfByte, int paramInt)
  {
    return decode(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }
  
  public static byte[] decode(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    Decoder localDecoder = new Decoder(paramInt3, new byte[paramInt2 * 3 / 4]);
    if (!localDecoder.process(paramArrayOfByte, paramInt1, paramInt2, true)) {
      throw new IllegalArgumentException("bad base-64");
    }
    if (localDecoder.op == localDecoder.output.length) {
      return localDecoder.output;
    }
    paramArrayOfByte = new byte[localDecoder.op];
    System.arraycopy(localDecoder.output, 0, paramArrayOfByte, 0, localDecoder.op);
    return paramArrayOfByte;
  }
  
  public static byte[] encode(byte[] paramArrayOfByte, int paramInt)
  {
    return encode(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }
  
  public static byte[] encode(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    Encoder localEncoder = new Encoder(paramInt3, null);
    int i = paramInt2 / 3 * 4;
    int j;
    if (localEncoder.do_padding)
    {
      paramInt3 = i;
      if (paramInt2 % 3 > 0) {
        paramInt3 = i + 4;
      }
      i = paramInt3;
      if (localEncoder.do_newline)
      {
        i = paramInt3;
        if (paramInt2 > 0)
        {
          j = (paramInt2 - 1) / 57;
          if (!localEncoder.do_cr) {
            break label186;
          }
        }
      }
    }
    label186:
    for (i = 2;; i = 1)
    {
      i = paramInt3 + i * (j + 1);
      localEncoder.output = new byte[i];
      localEncoder.process(paramArrayOfByte, paramInt1, paramInt2, true);
      if (($assertionsDisabled) || (localEncoder.op == i)) {
        break label192;
      }
      throw new AssertionError();
      paramInt3 = i;
      switch (paramInt2 % 3)
      {
      case 0: 
      default: 
        paramInt3 = i;
        break;
      case 1: 
        paramInt3 = i + 2;
        break;
      case 2: 
        paramInt3 = i + 3;
        break;
      }
    }
    label192:
    return localEncoder.output;
  }
  
  public static String encodeToString(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      paramArrayOfByte = new String(encode(paramArrayOfByte, paramInt), "US-ASCII");
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      throw new AssertionError(paramArrayOfByte);
    }
  }
  
  static abstract class Coder
  {
    public int op;
    public byte[] output;
    
    public abstract int maxOutputSize(int paramInt);
    
    public abstract boolean process(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean);
  }
  
  static class Decoder
    extends Base64.Coder
  {
    private static final int[] DECODE = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    private static final int[] DECODE_WEBSAFE = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    private static final int EQUALS = -2;
    private static final int SKIP = -1;
    private final int[] alphabet;
    private int state;
    private int value;
    
    public Decoder(int paramInt, byte[] paramArrayOfByte)
    {
      this.output = paramArrayOfByte;
      if ((paramInt & 0x8) == 0) {}
      for (paramArrayOfByte = DECODE;; paramArrayOfByte = DECODE_WEBSAFE)
      {
        this.alphabet = paramArrayOfByte;
        this.state = 0;
        this.value = 0;
        return;
      }
    }
    
    public int maxOutputSize(int paramInt)
    {
      return paramInt * 3 / 4 + 10;
    }
    
    public boolean process(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      if (this.state == 6) {
        return false;
      }
      int i1 = paramInt2 + paramInt1;
      paramInt2 = this.state;
      int i = this.value;
      int j = 0;
      byte[] arrayOfByte = this.output;
      int[] arrayOfInt = this.alphabet;
      int m = j;
      int n = i;
      if (paramInt1 < i1)
      {
        int k = j;
        m = i;
        n = paramInt1;
        if (paramInt2 == 0)
        {
          k = paramInt1;
          for (paramInt1 = i; k + 4 <= i1; paramInt1 = i)
          {
            i = arrayOfInt[(paramArrayOfByte[k] & 0xFF)] << 18 | arrayOfInt[(paramArrayOfByte[(k + 1)] & 0xFF)] << 12 | arrayOfInt[(paramArrayOfByte[(k + 2)] & 0xFF)] << 6 | arrayOfInt[(paramArrayOfByte[(k + 3)] & 0xFF)];
            paramInt1 = i;
            if (i < 0) {
              break;
            }
            arrayOfByte[(j + 2)] = ((byte)i);
            arrayOfByte[(j + 1)] = ((byte)(i >> 8));
            arrayOfByte[j] = ((byte)(i >> 16));
            j += 3;
            k += 4;
          }
          m = j;
          n = paramInt1;
          if (k < i1)
          {
            n = k;
            m = paramInt1;
            k = j;
          }
        }
        else
        {
          paramInt1 = n + 1;
          i = arrayOfInt[(paramArrayOfByte[n] & 0xFF)];
          switch (paramInt2)
          {
          }
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      j = k;
                      i = m;
                      break;
                      if (i >= 0)
                      {
                        paramInt2 += 1;
                        j = k;
                        break;
                      }
                    } while (i == -1);
                    this.state = 6;
                    return false;
                    if (i >= 0)
                    {
                      i = m << 6 | i;
                      paramInt2 += 1;
                      j = k;
                      break;
                    }
                  } while (i == -1);
                  this.state = 6;
                  return false;
                  if (i >= 0)
                  {
                    i = m << 6 | i;
                    paramInt2 += 1;
                    j = k;
                    break;
                  }
                  if (i == -2)
                  {
                    arrayOfByte[k] = ((byte)(m >> 4));
                    paramInt2 = 4;
                    j = k + 1;
                    i = m;
                    break;
                  }
                } while (i == -1);
                this.state = 6;
                return false;
                if (i >= 0)
                {
                  i = m << 6 | i;
                  arrayOfByte[(k + 2)] = ((byte)i);
                  arrayOfByte[(k + 1)] = ((byte)(i >> 8));
                  arrayOfByte[k] = ((byte)(i >> 16));
                  j = k + 3;
                  paramInt2 = 0;
                  break;
                }
                if (i == -2)
                {
                  arrayOfByte[(k + 1)] = ((byte)(m >> 2));
                  arrayOfByte[k] = ((byte)(m >> 10));
                  j = k + 2;
                  paramInt2 = 5;
                  i = m;
                  break;
                }
              } while (i == -1);
              this.state = 6;
              return false;
              if (i == -2)
              {
                paramInt2 += 1;
                j = k;
                i = m;
                break;
              }
            } while (i == -1);
            this.state = 6;
            return false;
          } while (i == -1);
          this.state = 6;
          return false;
        }
      }
      if (!paramBoolean)
      {
        this.state = paramInt2;
        this.value = n;
        this.op = m;
        return true;
      }
      paramInt1 = m;
      switch (paramInt2)
      {
      default: 
        paramInt1 = m;
      case 0: 
      case 1: 
      case 2: 
      case 3: 
        for (;;)
        {
          this.state = paramInt2;
          this.op = paramInt1;
          return true;
          this.state = 6;
          return false;
          arrayOfByte[m] = ((byte)(n >> 4));
          paramInt1 = m + 1;
          continue;
          i = m + 1;
          arrayOfByte[m] = ((byte)(n >> 10));
          paramInt1 = i + 1;
          arrayOfByte[i] = ((byte)(n >> 2));
        }
      }
      this.state = 6;
      return false;
    }
  }
  
  static class Encoder
    extends Base64.Coder
  {
    private static final byte[] ENCODE;
    private static final byte[] ENCODE_WEBSAFE;
    public static final int LINE_GROUPS = 19;
    private final byte[] alphabet;
    private int count;
    public final boolean do_cr;
    public final boolean do_newline;
    public final boolean do_padding;
    private final byte[] tail;
    int tailLen;
    
    static
    {
      if (!Base64.class.desiredAssertionStatus()) {}
      for (boolean bool = true;; bool = false)
      {
        $assertionsDisabled = bool;
        ENCODE = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        ENCODE_WEBSAFE = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
        return;
      }
    }
    
    public Encoder(int paramInt, byte[] paramArrayOfByte)
    {
      this.output = paramArrayOfByte;
      boolean bool1;
      if ((paramInt & 0x1) == 0)
      {
        bool1 = true;
        this.do_padding = bool1;
        if ((paramInt & 0x2) != 0) {
          break label101;
        }
        bool1 = true;
        label33:
        this.do_newline = bool1;
        if ((paramInt & 0x4) == 0) {
          break label106;
        }
        bool1 = bool2;
        label47:
        this.do_cr = bool1;
        if ((paramInt & 0x8) != 0) {
          break label111;
        }
        paramArrayOfByte = ENCODE;
        label63:
        this.alphabet = paramArrayOfByte;
        this.tail = new byte[2];
        this.tailLen = 0;
        if (!this.do_newline) {
          break label118;
        }
      }
      label101:
      label106:
      label111:
      label118:
      for (paramInt = 19;; paramInt = -1)
      {
        this.count = paramInt;
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label33;
        bool1 = false;
        break label47;
        paramArrayOfByte = ENCODE_WEBSAFE;
        break label63;
      }
    }
    
    public int maxOutputSize(int paramInt)
    {
      return paramInt * 8 / 5 + 10;
    }
    
    public boolean process(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      byte[] arrayOfByte1 = this.alphabet;
      byte[] arrayOfByte2 = this.output;
      int j = 0;
      int i = this.count;
      int n = paramInt2 + paramInt1;
      int k;
      switch (this.tailLen)
      {
      default: 
        k = -1;
        paramInt2 = paramInt1;
        paramInt1 = k;
        label64:
        if (paramInt1 != -1)
        {
          arrayOfByte2[0] = arrayOfByte1[(paramInt1 >> 18 & 0x3F)];
          arrayOfByte2[1] = arrayOfByte1[(paramInt1 >> 12 & 0x3F)];
          arrayOfByte2[2] = arrayOfByte1[(paramInt1 >> 6 & 0x3F)];
          j = 4;
          arrayOfByte2[3] = arrayOfByte1[(paramInt1 & 0x3F)];
          i -= 1;
          if (i == 0)
          {
            paramInt1 = j;
            if (this.do_cr)
            {
              paramInt1 = 5;
              arrayOfByte2[4] = 13;
            }
            j = paramInt1 + 1;
            arrayOfByte2[paramInt1] = 10;
            i = 19;
            paramInt1 = j;
          }
        }
        break;
      }
      for (;;)
      {
        label172:
        if (paramInt2 + 3 <= n)
        {
          j = (paramArrayOfByte[paramInt2] & 0xFF) << 16 | (paramArrayOfByte[(paramInt2 + 1)] & 0xFF) << 8 | paramArrayOfByte[(paramInt2 + 2)] & 0xFF;
          arrayOfByte2[paramInt1] = arrayOfByte1[(j >> 18 & 0x3F)];
          arrayOfByte2[(paramInt1 + 1)] = arrayOfByte1[(j >> 12 & 0x3F)];
          arrayOfByte2[(paramInt1 + 2)] = arrayOfByte1[(j >> 6 & 0x3F)];
          arrayOfByte2[(paramInt1 + 3)] = arrayOfByte1[(j & 0x3F)];
          paramInt2 += 3;
          paramInt1 += 4;
          i -= 1;
          if (i != 0) {
            break label1190;
          }
          if (!this.do_cr) {
            break label1187;
          }
          i = paramInt1 + 1;
          arrayOfByte2[paramInt1] = 13;
          paramInt1 = i;
        }
        label739:
        label761:
        label938:
        label1106:
        label1184:
        label1187:
        for (;;)
        {
          i = paramInt1 + 1;
          arrayOfByte2[paramInt1] = 10;
          j = 19;
          paramInt1 = i;
          i = j;
          break label172;
          k = -1;
          paramInt2 = paramInt1;
          paramInt1 = k;
          break label64;
          if (paramInt1 + 2 > n) {
            break;
          }
          k = this.tail[0];
          paramInt2 = paramInt1 + 1;
          paramInt1 = paramArrayOfByte[paramInt1];
          int m = paramArrayOfByte[paramInt2];
          this.tailLen = 0;
          paramInt1 = (k & 0xFF) << 16 | (paramInt1 & 0xFF) << 8 | m & 0xFF;
          paramInt2 += 1;
          break label64;
          if (paramInt1 + 1 > n) {
            break;
          }
          k = this.tail[0];
          m = this.tail[1];
          paramInt2 = paramInt1 + 1;
          paramInt1 = paramArrayOfByte[paramInt1];
          this.tailLen = 0;
          paramInt1 = (k & 0xFF) << 16 | (m & 0xFF) << 8 | paramInt1 & 0xFF;
          break label64;
          if (paramBoolean)
          {
            if (paramInt2 - this.tailLen == n - 1)
            {
              if (this.tailLen > 0)
              {
                paramArrayOfByte = this.tail;
                j = 1;
                k = paramArrayOfByte[0];
              }
              for (;;)
              {
                k = (k & 0xFF) << 4;
                this.tailLen -= j;
                m = paramInt1 + 1;
                arrayOfByte2[paramInt1] = arrayOfByte1[(k >> 6 & 0x3F)];
                j = m + 1;
                arrayOfByte2[m] = arrayOfByte1[(k & 0x3F)];
                paramInt1 = j;
                if (this.do_padding)
                {
                  k = j + 1;
                  arrayOfByte2[j] = 61;
                  paramInt1 = k + 1;
                  arrayOfByte2[k] = 61;
                }
                j = paramInt1;
                if (this.do_newline)
                {
                  j = paramInt1;
                  if (this.do_cr)
                  {
                    arrayOfByte2[paramInt1] = 13;
                    j = paramInt1 + 1;
                  }
                  arrayOfByte2[j] = 10;
                  j += 1;
                }
                k = paramInt2;
                if (($assertionsDisabled) || (this.tailLen == 0)) {
                  break;
                }
                throw new AssertionError();
                k = paramArrayOfByte[paramInt2];
                paramInt2 += 1;
                j = 0;
              }
            }
            if (paramInt2 - this.tailLen == n - 2) {
              if (this.tailLen > 1)
              {
                byte[] arrayOfByte3 = this.tail;
                j = 1;
                k = arrayOfByte3[0];
                if (this.tailLen <= 0) {
                  break label938;
                }
                m = this.tail[j];
                j += 1;
                k = (m & 0xFF) << 2 | (k & 0xFF) << 10;
                this.tailLen -= j;
                j = paramInt1 + 1;
                arrayOfByte2[paramInt1] = arrayOfByte1[(k >> 12 & 0x3F)];
                m = j + 1;
                arrayOfByte2[j] = arrayOfByte1[(k >> 6 & 0x3F)];
                paramInt1 = m + 1;
                arrayOfByte2[m] = arrayOfByte1[(k & 0x3F)];
                if (!this.do_padding) {
                  break label1184;
                }
                j = paramInt1 + 1;
                arrayOfByte2[paramInt1] = 61;
                paramInt1 = j;
              }
            }
          }
          for (;;)
          {
            j = paramInt1;
            if (this.do_newline)
            {
              j = paramInt1;
              if (this.do_cr)
              {
                arrayOfByte2[paramInt1] = 13;
                j = paramInt1 + 1;
              }
              arrayOfByte2[j] = 10;
              j += 1;
            }
            k = paramInt2;
            break;
            k = paramArrayOfByte[paramInt2];
            paramInt2 += 1;
            j = 0;
            break label739;
            m = paramArrayOfByte[paramInt2];
            paramInt2 += 1;
            break label761;
            k = paramInt2;
            j = paramInt1;
            if (!this.do_newline) {
              break;
            }
            k = paramInt2;
            j = paramInt1;
            if (paramInt1 <= 0) {
              break;
            }
            k = paramInt2;
            j = paramInt1;
            if (i == 19) {
              break;
            }
            if (this.do_cr)
            {
              j = paramInt1 + 1;
              arrayOfByte2[paramInt1] = 13;
              paramInt1 = j;
            }
            for (;;)
            {
              j = paramInt1 + 1;
              arrayOfByte2[paramInt1] = 10;
              k = paramInt2;
              break;
              m = j;
              if (!$assertionsDisabled)
              {
                m = j;
                if (k != n)
                {
                  throw new AssertionError();
                  if (paramInt2 != n - 1) {
                    break label1106;
                  }
                  arrayOfByte1 = this.tail;
                  j = this.tailLen;
                  this.tailLen = (j + 1);
                  arrayOfByte1[j] = paramArrayOfByte[paramInt2];
                  m = paramInt1;
                }
              }
              for (;;)
              {
                this.op = m;
                this.count = i;
                return true;
                m = paramInt1;
                if (paramInt2 == n - 2)
                {
                  arrayOfByte1 = this.tail;
                  j = this.tailLen;
                  this.tailLen = (j + 1);
                  arrayOfByte1[j] = paramArrayOfByte[paramInt2];
                  arrayOfByte1 = this.tail;
                  j = this.tailLen;
                  this.tailLen = (j + 1);
                  arrayOfByte1[j] = paramArrayOfByte[(paramInt2 + 1)];
                  m = paramInt1;
                }
              }
            }
          }
        }
        label1190:
        continue;
        paramInt1 = 4;
        continue;
        paramInt1 = j;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\util\Base64.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */