package com.mobsandgeeks.shorthand

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


public fun Context.inflateLayout(layoutResId: Int): View =
        inflateView(this, layoutResId, null, false)

public fun Context.inflateLayout(layoutResId: Int, parent: ViewGroup): View =
        inflateLayout(layoutResId, parent, true)

public fun Context.inflateLayout(layoutResId: Int, parent: ViewGroup, attachToRoot: Boolean): View =
        inflateView(this, layoutResId, parent, attachToRoot)

/*
 * -----------------------------------------------------------------------------
 *  Private functions
 * -----------------------------------------------------------------------------
 */
private fun inflateView(context: Context, layoutResId: Int, parent: ViewGroup?,
        attachToRoot: Boolean): View =
                LayoutInflater.from(context).inflate(layoutResId, parent, attachToRoot)