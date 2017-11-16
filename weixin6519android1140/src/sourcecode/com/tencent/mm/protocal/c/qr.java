package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class qr
  extends com.tencent.mm.bm.a
{
  public int jib;
  public String lSX;
  public String tQb;
  public int tRC;
  public int tRD;
  public String ugH;
  public azp ugI;
  public String ugJ;
  public String ugK;
  public String ugL;
  public int ugM;
  
  public qr()
  {
    GMTrace.i(3712328138752L, 27659);
    GMTrace.o(3712328138752L, 27659);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3712462356480L, 27660);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugI == null) {
        throw new b("Not all required fields were included: EmojiBuffer");
      }
      if (this.ugH != null) {
        paramVarArgs.e(1, this.ugH);
      }
      paramVarArgs.fk(2, this.tRD);
      paramVarArgs.fk(3, this.tRC);
      if (this.ugI != null)
      {
        paramVarArgs.fm(4, this.ugI.aYq());
        this.ugI.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.jib);
      if (this.lSX != null) {
        paramVarArgs.e(6, this.lSX);
      }
      if (this.ugJ != null) {
        paramVarArgs.e(7, this.ugJ);
      }
      if (this.ugK != null) {
        paramVarArgs.e(8, this.ugK);
      }
      if (this.ugL != null) {
        paramVarArgs.e(9, this.ugL);
      }
      if (this.tQb != null) {
        paramVarArgs.e(10, this.tQb);
      }
      paramVarArgs.fk(11, this.ugM);
      GMTrace.o(3712462356480L, 27660);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ugH != null) {
        paramInt = b.a.a.b.b.a.f(1, this.ugH) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tRD) + b.a.a.a.fh(3, this.tRC);
      paramInt = i;
      if (this.ugI != null) {
        paramInt = i + b.a.a.a.fj(4, this.ugI.aYq());
      }
      i = paramInt + b.a.a.a.fh(5, this.jib);
      paramInt = i;
      if (this.lSX != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.lSX);
      }
      i = paramInt;
      if (this.ugJ != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.ugJ);
      }
      paramInt = i;
      if (this.ugK != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ugK);
      }
      i = paramInt;
      if (this.ugL != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.ugL);
      }
      paramInt = i;
      if (this.tQb != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tQb);
      }
      i = b.a.a.a.fh(11, this.ugM);
      GMTrace.o(3712462356480L, 27660);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ugI == null) {
        throw new b("Not all required fields were included: EmojiBuffer");
      }
      GMTrace.o(3712462356480L, 27660);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      qr localqr = (qr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3712462356480L, 27660);
        return -1;
      case 1: 
        localqr.ugH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3712462356480L, 27660);
        return 0;
      case 2: 
        localqr.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3712462356480L, 27660);
        return 0;
      case 3: 
        localqr.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3712462356480L, 27660);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localqr.ugI = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3712462356480L, 27660);
        return 0;
      case 5: 
        localqr.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3712462356480L, 27660);
        return 0;
      case 6: 
        localqr.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3712462356480L, 27660);
        return 0;
      case 7: 
        localqr.ugJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3712462356480L, 27660);
        return 0;
      case 8: 
        localqr.ugK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3712462356480L, 27660);
        return 0;
      case 9: 
        localqr.ugL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3712462356480L, 27660);
        return 0;
      case 10: 
        localqr.tQb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3712462356480L, 27660);
        return 0;
      }
      localqr.ugM = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3712462356480L, 27660);
      return 0;
    }
    GMTrace.o(3712462356480L, 27660);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */