package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class sp
  extends azh
{
  public int eDB;
  public int eYn;
  public int eYo;
  public int jWs;
  public String jWt;
  public int mFA;
  public String mFr;
  public int mFu;
  public int mFw;
  public String mFx;
  public String mFy;
  public String mFz;
  public String mIB;
  public axp uiJ;
  
  public sp()
  {
    GMTrace.i(4049885724672L, 30174);
    GMTrace.o(4049885724672L, 30174);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4050019942400L, 30175);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jWs);
      if (this.jWt != null) {
        paramVarArgs.e(3, this.jWt);
      }
      paramVarArgs.fk(4, this.eDB);
      if (this.mFr != null) {
        paramVarArgs.e(5, this.mFr);
      }
      paramVarArgs.fk(6, this.eYn);
      paramVarArgs.fk(7, this.eYo);
      if (this.mIB != null) {
        paramVarArgs.e(8, this.mIB);
      }
      paramVarArgs.fk(9, this.mFu);
      if (this.uiJ != null)
      {
        paramVarArgs.fm(10, this.uiJ.aYq());
        this.uiJ.a(paramVarArgs);
      }
      paramVarArgs.fk(11, this.mFw);
      if (this.mFx != null) {
        paramVarArgs.e(12, this.mFx);
      }
      if (this.mFy != null) {
        paramVarArgs.e(13, this.mFy);
      }
      if (this.mFz != null) {
        paramVarArgs.e(14, this.mFz);
      }
      paramVarArgs.fk(15, this.mFA);
      GMTrace.o(4050019942400L, 30175);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jWs);
      paramInt = i;
      if (this.jWt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jWt);
      }
      i = paramInt + b.a.a.a.fh(4, this.eDB);
      paramInt = i;
      if (this.mFr != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.mFr);
      }
      i = paramInt + b.a.a.a.fh(6, this.eYn) + b.a.a.a.fh(7, this.eYo);
      paramInt = i;
      if (this.mIB != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.mIB);
      }
      i = paramInt + b.a.a.a.fh(9, this.mFu);
      paramInt = i;
      if (this.uiJ != null) {
        paramInt = i + b.a.a.a.fj(10, this.uiJ.aYq());
      }
      i = paramInt + b.a.a.a.fh(11, this.mFw);
      paramInt = i;
      if (this.mFx != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.mFx);
      }
      i = paramInt;
      if (this.mFy != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.mFy);
      }
      paramInt = i;
      if (this.mFz != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.mFz);
      }
      i = b.a.a.a.fh(15, this.mFA);
      GMTrace.o(4050019942400L, 30175);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4050019942400L, 30175);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      sp localsp = (sp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4050019942400L, 30175);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localsp.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4050019942400L, 30175);
        return 0;
      case 2: 
        localsp.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4050019942400L, 30175);
        return 0;
      case 3: 
        localsp.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4050019942400L, 30175);
        return 0;
      case 4: 
        localsp.eDB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4050019942400L, 30175);
        return 0;
      case 5: 
        localsp.mFr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4050019942400L, 30175);
        return 0;
      case 6: 
        localsp.eYn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4050019942400L, 30175);
        return 0;
      case 7: 
        localsp.eYo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4050019942400L, 30175);
        return 0;
      case 8: 
        localsp.mIB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4050019942400L, 30175);
        return 0;
      case 9: 
        localsp.mFu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4050019942400L, 30175);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localsp.uiJ = ((axp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4050019942400L, 30175);
        return 0;
      case 11: 
        localsp.mFw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4050019942400L, 30175);
        return 0;
      case 12: 
        localsp.mFx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4050019942400L, 30175);
        return 0;
      case 13: 
        localsp.mFy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4050019942400L, 30175);
        return 0;
      case 14: 
        localsp.mFz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4050019942400L, 30175);
        return 0;
      }
      localsp.mFA = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4050019942400L, 30175);
      return 0;
    }
    GMTrace.o(4050019942400L, 30175);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\sp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */