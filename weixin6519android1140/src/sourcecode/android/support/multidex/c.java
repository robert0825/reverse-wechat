package android.support.multidex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

final class c
{
  private static long a(RandomAccessFile paramRandomAccessFile, a parama)
  {
    CRC32 localCRC32 = new CRC32();
    long l = parama.size;
    paramRandomAccessFile.seek(parama.mK);
    int i = (int)Math.min(16384L, l);
    parama = new byte['䀀'];
    for (i = paramRandomAccessFile.read(parama, 0, i); i != -1; i = paramRandomAccessFile.read(parama, 0, (int)Math.min(16384L, l)))
    {
      localCRC32.update(parama, 0, i);
      l -= i;
      if (l == 0L) {
        break;
      }
    }
    return localCRC32.getValue();
  }
  
  private static a a(RandomAccessFile paramRandomAccessFile)
  {
    long l1 = 0L;
    long l2 = paramRandomAccessFile.length() - 22L;
    if (l2 < 0L) {
      throw new ZipException("File too short to be a zip file: " + paramRandomAccessFile.length());
    }
    long l3 = l2 - 65536L;
    if (l3 < 0L) {}
    for (;;)
    {
      int i = Integer.reverseBytes(101010256);
      do
      {
        paramRandomAccessFile.seek(l2);
        if (paramRandomAccessFile.readInt() == i) {
          break;
        }
        l3 = l2 - 1L;
        l2 = l3;
      } while (l3 >= l1);
      throw new ZipException("End Of Central Directory signature not found");
      paramRandomAccessFile.skipBytes(2);
      paramRandomAccessFile.skipBytes(2);
      paramRandomAccessFile.skipBytes(2);
      paramRandomAccessFile.skipBytes(2);
      a locala = new a();
      locala.size = (Integer.reverseBytes(paramRandomAccessFile.readInt()) & 0xFFFFFFFF);
      locala.mK = (Integer.reverseBytes(paramRandomAccessFile.readInt()) & 0xFFFFFFFF);
      return locala;
      l1 = l3;
    }
  }
  
  static long c(File paramFile)
  {
    paramFile = new RandomAccessFile(paramFile, "r");
    try
    {
      long l = a(paramFile, a(paramFile));
      return l;
    }
    finally
    {
      paramFile.close();
    }
  }
  
  static final class a
  {
    long mK;
    long size;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\multidex\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */