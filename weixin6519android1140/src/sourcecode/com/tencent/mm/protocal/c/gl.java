package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class gl
  extends ayx
{
  public String jhi;
  public String kBh;
  public int tSK;
  public String tSm;
  public String tSy;
  public String tUD;
  public String tUE;
  public int tUF;
  public String tUG;
  public int tUH;
  public String tUI;
  public String tUJ;
  public azp tUK;
  public int tUL;
  public int tUM;
  public int tUN;
  public String tUO;
  
  public gl()
  {
    GMTrace.i(13168503947264L, 98113);
    GMTrace.o(13168503947264L, 98113);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13168638164992L, 98114);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      if (this.tUD != null) {
        paramVarArgs.e(3, this.tUD);
      }
      paramVarArgs.fk(4, this.tSK);
      if (this.tUE != null) {
        paramVarArgs.e(5, this.tUE);
      }
      paramVarArgs.fk(6, this.tUF);
      if (this.tUG != null) {
        paramVarArgs.e(7, this.tUG);
      }
      if (this.tSm != null) {
        paramVarArgs.e(8, this.tSm);
      }
      paramVarArgs.fk(9, this.tUH);
      if (this.tUI != null) {
        paramVarArgs.e(10, this.tUI);
      }
      if (this.tUJ != null) {
        paramVarArgs.e(11, this.tUJ);
      }
      if (this.tUK != null)
      {
        paramVarArgs.fm(12, this.tUK.aYq());
        this.tUK.a(paramVarArgs);
      }
      if (this.kBh != null) {
        paramVarArgs.e(13, this.kBh);
      }
      paramVarArgs.fk(14, this.tUL);
      paramVarArgs.fk(15, this.tUM);
      if (this.tSy != null) {
        paramVarArgs.e(16, this.tSy);
      }
      paramVarArgs.fk(17, this.tUN);
      if (this.tUO != null) {
        paramVarArgs.e(18, this.tUO);
      }
      GMTrace.o(13168638164992L, 98114);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jhi);
      }
      i = paramInt;
      if (this.tUD != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tUD);
      }
      i += b.a.a.a.fh(4, this.tSK);
      paramInt = i;
      if (this.tUE != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tUE);
      }
      i = paramInt + b.a.a.a.fh(6, this.tUF);
      paramInt = i;
      if (this.tUG != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tUG);
      }
      i = paramInt;
      if (this.tSm != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.tSm);
      }
      i += b.a.a.a.fh(9, this.tUH);
      paramInt = i;
      if (this.tUI != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tUI);
      }
      i = paramInt;
      if (this.tUJ != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.tUJ);
      }
      paramInt = i;
      if (this.tUK != null) {
        paramInt = i + b.a.a.a.fj(12, this.tUK.aYq());
      }
      i = paramInt;
      if (this.kBh != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.kBh);
      }
      i = i + b.a.a.a.fh(14, this.tUL) + b.a.a.a.fh(15, this.tUM);
      paramInt = i;
      if (this.tSy != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.tSy);
      }
      i = paramInt + b.a.a.a.fh(17, this.tUN);
      paramInt = i;
      if (this.tUO != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.tUO);
      }
      GMTrace.o(13168638164992L, 98114);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13168638164992L, 98114);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      gl localgl = (gl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13168638164992L, 98114);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localgl.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 2: 
        localgl.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 3: 
        localgl.tUD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 4: 
        localgl.tSK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 5: 
        localgl.tUE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 6: 
        localgl.tUF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 7: 
        localgl.tUG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 8: 
        localgl.tSm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 9: 
        localgl.tUH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 10: 
        localgl.tUI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 11: 
        localgl.tUJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localgl.tUK = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 13: 
        localgl.kBh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 14: 
        localgl.tUL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 15: 
        localgl.tUM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 16: 
        localgl.tSy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      case 17: 
        localgl.tUN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13168638164992L, 98114);
        return 0;
      }
      localgl.tUO = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(13168638164992L, 98114);
      return 0;
    }
    GMTrace.o(13168638164992L, 98114);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\gl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */