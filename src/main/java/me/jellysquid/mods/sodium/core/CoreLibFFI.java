package me.jellysquid.mods.sodium.core;

public class CoreLibFFI {
    static native void setPanicHandler(long ptr);

    static native void setAllocator(long pAllocatorPfn);

    static native void graphCreate(long ppGraph);

    static native void graphAddChunk(long pGraph, int x, int y, int z);
    static native void graphUpdateChunk(long pGraph, int x, int y, int z, long pNode);
    static native void graphRemoveChunk(long pGraph, int x, int y, int z);
    static native void graphSearch(
            long pGraph,
            long ppFrustumPoints,
            long pCameraPos,
            int viewDistance,
            float fogDistance,
            long pResults
    );

    static {
        System.loadLibrary("sodium_core");
    }

}
