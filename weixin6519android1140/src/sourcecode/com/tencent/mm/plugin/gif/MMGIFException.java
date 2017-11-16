package com.tencent.mm.plugin.gif;

import com.tencent.gmtrace.GMTrace;
import java.io.IOException;

public class MMGIFException
  extends IOException
{
  public static final int D_GIF_ERR_CLOSE_FAILED = 110;
  public static final int D_GIF_ERR_DATA_TOO_BIG = 108;
  public static final int D_GIF_ERR_EOF_TOO_SOON = 113;
  public static final int D_GIF_ERR_IMAGE_DEFECT = 112;
  public static final int D_GIF_ERR_NOT_ENOUGH_MEM = 109;
  public static final int D_GIF_ERR_NOT_GIF_FILE = 103;
  public static final int D_GIF_ERR_NOT_READABLE = 111;
  public static final int D_GIF_ERR_NO_COLOR_MAP = 106;
  public static final int D_GIF_ERR_NO_IMAG_DSCR = 105;
  public static final int D_GIF_ERR_NO_SCRN_DSCR = 104;
  public static final int D_GIF_ERR_OPEN_FAILED = 101;
  public static final int D_GIF_ERR_READ_FAILED = 102;
  public static final int D_GIF_ERR_WRONG_RECORD = 107;
  private static final String TAG = "MicroMsg.GIF.MMGIFException";
  private static final long serialVersionUID = 1L;
  private final int errorCode;
  
  public MMGIFException(int paramInt)
  {
    super("MicroMsg.GIF.MMGIFException" + paramInt);
    GMTrace.i(12889331073024L, 96033);
    this.errorCode = paramInt;
    GMTrace.o(12889331073024L, 96033);
  }
  
  public int getErrorCode()
  {
    GMTrace.i(12889465290752L, 96034);
    int i = this.errorCode;
    GMTrace.o(12889465290752L, 96034);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\gif\MMGIFException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */