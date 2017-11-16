package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BitmapTeleporter
  implements SafeParcelable
{
  public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new d();
  ParcelFileDescriptor aiZ;
  final int aja;
  private Bitmap ajb;
  private boolean ajc;
  private File ajd;
  final int mVersionCode;
  
  BitmapTeleporter(int paramInt1, ParcelFileDescriptor paramParcelFileDescriptor, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.aiZ = paramParcelFileDescriptor;
    this.aja = paramInt2;
    this.ajb = null;
    this.ajc = false;
  }
  
  private static void c(Closeable paramCloseable)
  {
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  /* Error */
  private java.io.FileOutputStream kk()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 57	com/google/android/gms/common/data/BitmapTeleporter:ajd	Ljava/io/File;
    //   4: ifnonnull +13 -> 17
    //   7: new 59	java/lang/IllegalStateException
    //   10: dup
    //   11: ldc 61
    //   13: invokespecial 64	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   16: athrow
    //   17: ldc 66
    //   19: ldc 68
    //   21: aload_0
    //   22: getfield 57	com/google/android/gms/common/data/BitmapTeleporter:ajd	Ljava/io/File;
    //   25: invokestatic 74	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   28: astore_1
    //   29: new 76	java/io/FileOutputStream
    //   32: dup
    //   33: aload_1
    //   34: invokespecial 79	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   37: astore_2
    //   38: aload_0
    //   39: aload_1
    //   40: ldc 80
    //   42: invokestatic 86	android/os/ParcelFileDescriptor:open	(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //   45: putfield 36	com/google/android/gms/common/data/BitmapTeleporter:aiZ	Landroid/os/ParcelFileDescriptor;
    //   48: aload_1
    //   49: invokevirtual 90	java/io/File:delete	()Z
    //   52: pop
    //   53: aload_2
    //   54: areturn
    //   55: astore_1
    //   56: new 59	java/lang/IllegalStateException
    //   59: dup
    //   60: ldc 92
    //   62: aload_1
    //   63: invokespecial 95	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   66: athrow
    //   67: astore_1
    //   68: new 59	java/lang/IllegalStateException
    //   71: dup
    //   72: ldc 97
    //   74: invokespecial 64	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	BitmapTeleporter
    //   28	21	1	localFile	File
    //   55	8	1	localIOException	IOException
    //   67	1	1	localFileNotFoundException	java.io.FileNotFoundException
    //   37	17	2	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   17	29	55	java/io/IOException
    //   29	48	67	java/io/FileNotFoundException
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Bitmap localBitmap;
    Object localObject;
    byte[] arrayOfByte;
    if (this.aiZ == null)
    {
      localBitmap = this.ajb;
      localObject = ByteBuffer.allocate(localBitmap.getRowBytes() * localBitmap.getHeight());
      localBitmap.copyPixelsToBuffer((Buffer)localObject);
      arrayOfByte = ((ByteBuffer)localObject).array();
      localObject = new DataOutputStream(kk());
    }
    try
    {
      ((DataOutputStream)localObject).writeInt(arrayOfByte.length);
      ((DataOutputStream)localObject).writeInt(localBitmap.getWidth());
      ((DataOutputStream)localObject).writeInt(localBitmap.getHeight());
      ((DataOutputStream)localObject).writeUTF(localBitmap.getConfig().toString());
      ((DataOutputStream)localObject).write(arrayOfByte);
      c((Closeable)localObject);
      d.a(this, paramParcel, paramInt | 0x1);
      this.aiZ = null;
      return;
    }
    catch (IOException paramParcel)
    {
      throw new IllegalStateException("Could not write into unlinked file", paramParcel);
    }
    finally
    {
      c((Closeable)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\data\BitmapTeleporter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */